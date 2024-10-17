package com.storyin.journalApp.service;

import com.storyin.journalApp.entity.JournalEntry;
import com.storyin.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService  {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public List<JournalEntry> getAll(){
        return journalEntryRepo.findAll();
    }

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepo.save(journalEntry);
    }

    public Optional<JournalEntry> getById(ObjectId id){
        return journalEntryRepo.findById(id);
    }

    public boolean deleteById(ObjectId id){
        journalEntryRepo.deleteById(id);
        return true;
    }

}
