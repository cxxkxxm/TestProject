package com.testproject.domain;

/**
 * Created by Sibie on 8/25/2016.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Sibie on 8/24/2016.
 */
@Entity
public class Record {
    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private String stock;
    private String symbol;
    private String currency;
    private Double buyprice;
    private Double stocksize;
    private Double networth;
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getBuyPrice() {
        return buyprice;
    }

    public void setBuyPrice(Double buyprice) {
        this.buyprice = buyprice;
    }

    public Double getStockSize() {
        return stocksize;
    }

    public void setStockSize(Double stocksize) {
        this.stocksize = stocksize;
    }

    public Double getNetWorth() {
        return networth;
    }

    public void setNetworth(Double networth) {
        this.networth = networth;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}

