package com.dataArt.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "HALL")
public class Hall implements Serializable {

    private static final long serialVersionUID = 5844409830631065662L;
    private int id;
    private byte seat;
    private byte row;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "seat", nullable = false, insertable = true, updatable = true)
    public byte getSeat() {
        return seat;
    }

    public void setSeat(byte seat) {
        this.seat = seat;
    }


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

        Hall hall = (Hall) o;

        if (id != hall.id) return false;
        if (seat != hall.seat) return false;
        if (row != hall.row) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) seat;
        result = 31 * result + (int) row;
        return result;
    }
}
