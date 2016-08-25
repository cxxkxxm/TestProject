package com.testproject.web;

import com.testproject.domain.Record;
import com.testproject.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sibie on 8/24/2016.
 */
@RestController
public class RecordRestController {
    private final RecordRepository recordRepository;

    @Autowired
    public RecordRestController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @RequestMapping(value = "/post/findBySymbol")
    public Record findOneBySymbol(@RequestParam("symbol") String symbol) {
        return recordRepository.findOneBySymbol(symbol);
    }

    @RequestMapping(value = "/post/search")
    public List<Record> findByStockContaining(@RequestParam("keyword") String keyword) {
        return recordRepository.findByStockContaining(keyword);
    }

    @RequestMapping(value = "/post/count")
    public Long count() {
        return recordRepository.count();
    }

}

