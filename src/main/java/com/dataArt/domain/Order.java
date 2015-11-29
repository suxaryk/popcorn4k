package com.dataArt.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by suxarina on 11/30/2015.
 */
@Entity
@Table(name = "ORDER")
public class Order implements Serializable{


    private static final long serialVersionUID = -4039703885311604099L;
    private int id;
    private byte book;
    private byte buy;
    private byte status;
    private OrderItem orderItem;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "book", nullable = false, insertable = true, updatable = true)
    public byte getBook() {
        return book;
    }

    public void setBook(byte book) {
        this.book = book;
    }

    @Column(name = "buy", nullable = false, insertable = true, updatable = true)
    public byte getBuy() {
        return buy;
    }

    public void setBuy(byte buy) {
        this.buy = buy;
    }

    @Column(name = "status", nullable = false, insertable = true, updatable = true)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @OneToOne
    @JoinColumn(name = "order_item_id", referencedColumnName = "id", nullable = false)
    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (book != order.book) return false;
        if (buy != order.buy) return false;
        if (status != order.status) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) book;
        result = 31 * result + (int) buy;
        result = 31 * result + (int) status;
        return result;
    }
}
