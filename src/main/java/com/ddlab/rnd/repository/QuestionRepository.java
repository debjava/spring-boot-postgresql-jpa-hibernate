package com.ddlab.rnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
