package com.storyin.journalApp.service;

import com.storyin.journalApp.entity.JournalEntry;
import com.storyin.journalApp.entity.UserEntity;
import com.storyin.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService  {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    @Autowired
    private UserService userService;

    public List<JournalEntry> getAll(){
        return journalEntryRepo.findAll();
    }

    @Transactional
    public void saveEntry(JournalEntry journalEntry, String username){
        try{
            UserEntity user = userService.findByUsername(username);
            journalEntry.setDate(LocalDateTime.now());
            JournalEntry saved = journalEntryRepo.save(journalEntry);
            user.getJournalEntryList().add(saved);
            userService.saveEntry(user);
        }catch (Exception e){
            throw new RuntimeException("An Error Occured at the time of saving object : " + e);
        }
    }

    public void saveEntry(JournalEntry journalEntry){
        JournalEntry saved = journalEntryRepo.save(journalEntry);
    }

    public Optional<JournalEntry> getById(ObjectId id){
        return journalEntryRepo.findById(id);
    }

    public boolean deleteById(ObjectId id, String username){
        if(journalEntryRepo.existsById(id)){

            UserEntity user = userService.findByUsername(username);
            user.getJournalEntryList().removeIf(x -> x.equals(id));

            journalEntryRepo.deleteById(id);

            return true;
        }else {
            return false;
        }
    }



}
