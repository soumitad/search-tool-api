package com.hughes.acronym.search.tool.repository;

import com.hughes.acronym.search.tool.model.Acronym;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public interface AcronymRepository extends CrudRepository<Acronym, Long> {
    //@Query("select id as id, code as code, definition as definition from Acronym where code like ?1%")
    List<Acronym> findByCodeStartingWith(String code);
}
