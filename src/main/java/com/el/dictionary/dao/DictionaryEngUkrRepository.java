package com.el.dictionary.dao;

import com.el.dictionary.model.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DictionaryEngUkrRepository extends JpaRepository<Dictionary, Long> {




}
