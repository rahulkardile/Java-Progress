package com.storyin.journalApp.controller;

import com.storyin.journalApp.entity.JournalEntry;
import com.storyin.journalApp.service.JournalEntryService;
import com.storyin.journalApp.utils.ErrorHandler;
import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    JournalEntryService journalEntryService;

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){

        List<JournalEntry> entries = journalEntryService.getAll();

       ErrorHandler errorHandler = new ErrorHandler("Content Not Found!", 204);

        if(entries.isEmpty()){
            return new ResponseEntity<>(errorHandler, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(entries, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<JournalEntry> findByIdAndReturn(@PathVariable ObjectId id){

        Optional<JournalEntry> entry = journalEntryService.getById(id);
        if(entry.isPresent()){
            return new ResponseEntity<>(entry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@Valid @RequestBody JournalEntry entry, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            ErrorHandler errorHandler = new ErrorHandler(errorMessage, HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<>(errorHandler, HttpStatus.BAD_REQUEST);
        }

        try{

            entry.setDate(LocalDateTime.now());
            journalEntryService.saveEntry(entry);
            return new ResponseEntity<>(entry, HttpStatus.CREATED);

        }catch (Exception e){

            ErrorHandler errorHandler = new ErrorHandler( !e.getMessage().isEmpty() ? e.getMessage() : "Internal Server error!", 500);
            return new ResponseEntity<>(errorHandler, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<JournalEntry> findByIdAndUpdate(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry){
      JournalEntry old = journalEntryService.getById(id).orElse(null);

      if(old != null){
          old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
          old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
      }

      journalEntryService.saveEntry(old);
      return new ResponseEntity<>(old, HttpStatus.CREATED);
    }

    @DeleteMapping("/id/{id}")
        public ResponseEntity<?> findByIdAndDelete(@PathVariable ObjectId id){
        journalEntryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
