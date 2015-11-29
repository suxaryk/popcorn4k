package com.dataArt.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by suxarina on 11/30/2015.
 */
@Entity
@Table(name = "TICKET")
public class Ticket implements Serializable{

    private static final long serialVersionUID = 3634798780236076298L;
    private int id;
    private int price;
    private Film film;
    private Hall hall;
    private Visitor visitor;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "price", nullable = false, insertable = true, updatable = true)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != ticket.id) return false;
        if (price != ticket.price) return false;

        return true;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", referencedColumnName = "id", nullable = false)
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false)
    public Hall getHall() {
        return hall;
    }


    public void setHall(Hall hall) {
        this.hall = hall;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visitor_id", referencedColumnName = "id", nullable = false)
    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + price;
        return result;
    }
}
