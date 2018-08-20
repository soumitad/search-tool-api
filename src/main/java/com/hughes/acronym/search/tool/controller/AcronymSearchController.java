package com.hughes.acronym.search.tool.controller;

import com.hughes.acronym.search.tool.model.Acronym;
import com.hughes.acronym.search.tool.service.AcronymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import java.util.List;
@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/search")
public class AcronymSearchController {

    @Autowired
    private AcronymService acronymService;

    @RequestMapping(value="/acronym/{value}", method = RequestMethod.GET)
    public List<Acronym> login(@PathVariable("value") String acronym){
        List<Acronym> acronymObj = acronymService.findAcronym(acronym);
        return acronymObj;
    }

    @RequestMapping(value="/acronym/all/{value}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Acronym>> getAcronym(@PathVariable("value") String acronym){
        Iterable<Acronym> acronymObj = acronymService.findAcronymList(acronym);
        return new ResponseEntity<Iterable<Acronym>>(acronymObj, HttpStatus.OK);
    }
}
