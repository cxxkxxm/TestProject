package com.testproject.repository;

import com.testproject.domain.Record;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sibie on 8/24/2016.
 */
@Repository
public interface RecordRepository extends CrudRepository<Record, Long>{
    Record findOneBySymbol(String symbol);

    List<Record> findAll();

    List<Record> findByStockContaining(String keyword);

    //Record createRecord(String date, String stock, String symbol, String currency, Double buyprice, Double stocksize, Double networth, String comments );
    //Record createRecord();

}