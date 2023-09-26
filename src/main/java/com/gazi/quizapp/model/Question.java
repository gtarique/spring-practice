package com.gazi.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data // coming from lombok to avoid getter and setters for each filed.
@Entity // we want this table mapped with class
public class Question {

    @Id // ID is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID is auto generated
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
    private String category;
}
