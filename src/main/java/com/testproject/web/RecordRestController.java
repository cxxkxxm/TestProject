package com.testproject.web;

import com.testproject.domain.Record;
import com.testproject.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Sibie on 8/24/2016.
 */
@RestController
@RequestMapping("/record")
public class RecordRestController {
    private final RecordRepository recordRepository;

    @Autowired
    public RecordRestController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Record> readAll() {
        return recordRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    Record add(@RequestBody @Valid Record input) {
        return this.recordRepository.save(input);
    }

    @RequestMapping(value = "/find/{symbol}")
    public Record findOneBySymbol(@PathVariable String symbol) {
        return recordRepository.findOneBySymbol(symbol);
    }

    @RequestMapping(value = "/count")
    public Long count() {
        return recordRepository.count();
    }

    @RequestMapping(value = "/{id}")
    public void deleteRecord(@PathVariable Integer id) {
        recordRepository.delete(id);
    }
}