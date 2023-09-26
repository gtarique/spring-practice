package com.gazi.quizapp.dao;

import com.gazi.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> { // Using JpaRepository To
                                                                        // avoid JDBC 7 steps (sql queries, iterate through lot of data etc.)
                                                                        // which is so lengthy.
                                                                        // JPARepository ask for 2 things<Question, Integer>:
                                                                        // 1. What type of table are we working with and
                                                                        // 2. what is the type of primary key.
    List<Question> findByCategory(String category);

    @Query(value="SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
