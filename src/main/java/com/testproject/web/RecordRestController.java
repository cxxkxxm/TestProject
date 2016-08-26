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

    @RequestMapping(value = "/post/findAll")
    public List<Record> findAll() {
        return recordRepository.findAll();
    }

    /*@RequestMapping(value = "/post/save")
    public Record createRecord(String date, String stock, String symbol, String currency, Double buyprice, Double stocksize, Double networth, String comments) {
        String invId = "";
        Record newRecord;
        try {
            newRecord = new Record(date, stock, symbol, currency, buyprice, stocksize, networth, comments);
            recordRepository.save(newRecord);
            invId = String.valueOf(newRecord.getId());
        }
        catch (Exception ex) {
            return null;
        }
        //return "New investment recorded successfully with id = " + invId;

        return newRecord;
    }*/

    @RequestMapping(value = "/post/search")
    public List<Record> findByStockContaining(@RequestParam("keyword") String keyword) {
        return recordRepository.findByStockContaining(keyword);
    }

    @RequestMapping(value = "/post/count")
    public Long count() {
        return recordRepository.count();
    }

}

