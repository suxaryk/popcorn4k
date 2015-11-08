package com.dataArt.model;

import javax.persistence.*;

/**
 * Created by suxarina on 11/7/2015.
 */
@Entity
@Table(name = "order", schema = "", catalog = "popcorn4k")
public class Order {
    private int orderId;
    private byte book;
    private byte buy;
    private byte status;

    @Id
    @Column(name = "order_id", nullable = false, insertable = true, updatable = true)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "book", nullable = false, insertable = true, updatable = true)
    public byte getBook() {
        return book;
    }

    public void setBook(byte book) {
        this.book = book;
    }

    @Basic
    @Column(name = "buy", nullable = false, insertable = true, updatable = true)
    public byte getBuy() {
        return buy;
    }

    public void setBuy(byte buy) {
        this.buy = buy;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order that = (Order) o;

        if (orderId != that.orderId) return false;
        if (book != that.book) return false;
        if (buy != that.buy) return false;
        if (status != that.status) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (int) book;
        result = 31 * result + (int) buy;
        result = 31 * result + (int) status;
        return result;
    }
}
