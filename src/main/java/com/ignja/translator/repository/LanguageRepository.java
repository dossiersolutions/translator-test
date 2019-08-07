package com.ignja.translator.repository;

import com.ignja.translator.model.LanguageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageModel, Long> {

}