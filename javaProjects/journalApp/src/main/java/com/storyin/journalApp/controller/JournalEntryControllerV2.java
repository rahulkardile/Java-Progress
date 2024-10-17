package com.storyin.journalApp.controller;

import com.storyin.journalApp.entity.JournalEntry;
import com.storyin.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    JournalEntryService journalEntryService;

    @GetMapping("/all")
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @GetMapping("/id/{id}")
    public JournalEntry findByIdAndReturn(@PathVariable ObjectId id){
        return journalEntryService.getById(id).orElse(null);
    }

    @PostMapping("/create")
    public JournalEntry create(@RequestBody JournalEntry entry){
        entry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(entry);
        return entry;
    }

    @PutMapping("/update/{id}")
    public JournalEntry findByIdAndUpdate(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry){
      JournalEntry old = journalEntryService.getById(id).orElse(null);

      if(old != null){
          old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
          old.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : old.getContent());
      }

      journalEntryService.saveEntry(old);
      return old;
    }

    @DeleteMapping("/id/{id}")
    public boolean findByIdAndDelete(@PathVariable ObjectId id){
    journalEntryService.deleteById(id);
    return true;
    }

}
