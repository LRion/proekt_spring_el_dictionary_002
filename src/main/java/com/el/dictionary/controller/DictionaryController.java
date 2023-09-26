package com.el.dictionary.controller;


import com.el.dictionary.dao.DictionaryEngUkrRepository;
import com.el.dictionary.dtos.DictionaryDTO;
import com.el.dictionary.model.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    public DictionaryEngUkrRepository dictionaryEngUkrRdepository;

    @PostMapping

    public void createTranslation(@RequestBody DictionaryDTO dictionaryDTO){
        Dictionary dictionary = new Dictionary();

        dictionary.setWordEng(dictionaryDTO.getEngWord());
        dictionary.setWordUkr(dictionaryDTO.getUkrWord());

        dictionaryEngUkrRdepository.save(dictionary);

    }




}
