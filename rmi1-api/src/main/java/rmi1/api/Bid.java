/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi1.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author sihai
 */
public class Bid implements java.io.Serializable {
    private LocalDateTime date;
    private BigDecimal price;
    private int bid;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Bid{" + "date=" + date + ", price=" + price + ", bid=" + bid + '}';
    }
        
}
