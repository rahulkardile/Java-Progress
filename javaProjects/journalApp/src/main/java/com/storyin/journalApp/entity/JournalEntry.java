package com.storyin.journalApp.entity;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data //it will generate getter, setter and requiredArgConstructore
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId id;

    @NotBlank(message = "please provide title!")
    @NonNull
    private String title;

    @NotBlank(message = "please provide content!")
    private String content;
    private LocalDateTime date;
}
