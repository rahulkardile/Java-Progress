package com.storyin.journalApp.controller;

import com.storyin.journalApp.entity.JournalEntry;
import com.storyin.journalApp.entity.UserEntity;
import com.storyin.journalApp.service.JournalEntryService;
import com.storyin.journalApp.service.UserService;
import com.storyin.journalApp.utils.ErrorHandler;
import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    JournalEntryService journalEntryService;

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<?> getAllJournalEntriesOfUser(@PathVariable String username) {

        UserEntity user = userService.findByUsername(username);
        List<JournalEntry> all = user.getJournalEntryList();

        ErrorHandler errorHandler = new ErrorHandler("Content Not Found!" , 204);

        if (all.isEmpty()) {
            return new ResponseEntity<>(errorHandler , HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(all , HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {

        List<JournalEntry> entries = journalEntryService.getAll();

        ErrorHandler errorHandler = new ErrorHandler("Content Not Found!" , 204);

        if (entries.isEmpty()) {
            return new ResponseEntity<>(errorHandler , HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(entries , HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Object> findByIdAndReturn(@PathVariable ObjectId id) {

        Optional<JournalEntry> entry = journalEntryService.getById(id);
        if (entry.isPresent()) {
            return new ResponseEntity<>(entry.get() , HttpStatus.OK);
        }
        ErrorHandler errorHandler = new ErrorHandler("Not Found" , 404);
        return new ResponseEntity<>(errorHandler , HttpStatus.NOT_FOUND);
    }

    @PostMapping("/{username}")
    public ResponseEntity<Object> create(@Valid @RequestBody JournalEntry entry , BindingResult bindingResult , @PathVariable String username) {

        System.out.println("start");
        if (bindingResult.hasErrors()) {
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            ErrorHandler errorHandler = new ErrorHandler(errorMessage , HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<>(errorHandler , HttpStatus.BAD_REQUEST);
        }
        System.out.println("mid ok");
        try {

            journalEntryService.saveEntry(entry , username);
            return new ResponseEntity<>(entry , HttpStatus.CREATED);

        }
        catch (Exception e){

            ErrorHandler errorHandler = new ErrorHandler(!e.getMessage().isEmpty() ? e.getMessage() : "Internal Server error!" , 500);
            return new ResponseEntity<>(errorHandler , HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<JournalEntry> findByIdAndUpdate(@PathVariable ObjectId id , @RequestBody JournalEntry newEntry) {
        JournalEntry old = journalEntryService.getById(id).orElse(null);

        if (old != null) {
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
        }

      journalEntryService.saveEntry(old);
        return new ResponseEntity<>(old , HttpStatus.CREATED);
    }

    @DeleteMapping("/id/{username}/{id}")
    public ResponseEntity<?> findByIdAndDelete(@PathVariable ObjectId id, @PathVariable String username) {
        boolean deleted = journalEntryService.deleteById(id, username);
        ErrorHandler eh = new ErrorHandler("" , 202);
        if (deleted) {
            eh.setMessage("Entry Deleted!");
            return new ResponseEntity<>(eh , HttpStatus.ACCEPTED);
        } else {
            eh.setMessage("Entry Not Found!");
            eh.setStatusCode(404);
            return new ResponseEntity<>(eh, HttpStatus.NOT_FOUND);
        }
    }

}
