package com.hughes.acronym.search.tool.service;

import com.hughes.acronym.search.tool.model.Acronym;
import com.hughes.acronym.search.tool.repository.AcronymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcronymService {

    @Autowired
    AcronymRepository acronymRepository;
    public List<Acronym> findAcronym(String acronym){
       return acronymRepository.findByCodeStartingWith(acronym);
      //  return acronymRepository.findAll();
    }

    public Iterable<Acronym> findAcronymList(String acronym){
        //return acronymRepository.findByCodeStartingWith(acronym);
        Iterable<Acronym> list = acronymRepository.findAll();
          return list;
    }
}
