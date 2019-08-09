package com.ignja.translator.repository;

import com.ignja.translator.model.TranslationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationsRepository extends JpaRepository<TranslationModel, Long> {

}