package com.dataArt.model;

import javax.persistence.*;

/**
 * Created by suxarina on 11/7/2015.
 */
@Entity
@Table(name = "orderitem", schema = "", catalog = "popcorn4k")
public class Orderitem {
    private int orderItemId;
    private int count;

    @Id
    @Column(name = "orderItem_id", nullable = false, insertable = true, updatable = true)
    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Basic
    @Column(name = "count", nullable = false, insertable = true, updatable = true)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orderitem that = (Orderitem) o;

        if (orderItemId != that.orderItemId) return false;
        if (count != that.count) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderItemId;
        result = 31 * result + count;
        return result;
    }
}
