package com.dataArt.model;

import javax.persistence.*;

/**
 * Created by suxarina on 11/7/2015.
 */
@Entity
@Table(name = "hall", schema = "", catalog = "popcorn4k")
public class Hall {
    private int hallId;
    private byte seat;
    private byte row;

    @Id
    @Column(name = "hall_id", nullable = false, insertable = true, updatable = true)
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    @Basic
    @Column(name = "seat", nullable = false, insertable = true, updatable = true)
    public byte getSeat() {
        return seat;
    }

    public void setSeat(byte seat) {
        this.seat = seat;
    }

    @Basic
    @Column(name = "row", nullable = false, insertable = true, updatable = true)
    public byte getRow() {
        return row;
    }

    public void setRow(byte row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hall that = (Hall) o;

        if (hallId != that.hallId) return false;
        if (seat != that.seat) return false;
        if (row != that.row) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hallId;
        result = 31 * result + (int) seat;
        result = 31 * result + (int) row;
        return result;
    }
}
