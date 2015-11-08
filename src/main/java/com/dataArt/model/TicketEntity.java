package com.dataArt.model;

import javax.persistence.*;

/**
 * Created by suxarina on 11/7/2015.
 */
@Entity
@Table(name = "ticket", schema = "", catalog = "popcorn4k")
public class TicketEntity {
    private int ticketId;
    private int price;
    private Film filmByFilmId;
    private Hall hallByHallId;
    private Orderitem orderitemByOrderItemId;

    @Id
    @Column(name = "ticket_id", nullable = false, insertable = true, updatable = true)
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
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

        TicketEntity that = (TicketEntity) o;

        if (ticketId != that.ticketId) return false;
        if (price != that.price) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ticketId;
        result = 31 * result + price;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id", nullable = false)
    public Film getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(Film filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    @ManyToOne
    @JoinColumn(name = "hall_id", referencedColumnName = "hall_id", nullable = false)
    public Hall getHallByHallId() {
        return hallByHallId;
    }

    public void setHallByHallId(Hall hallByHallId) {
        this.hallByHallId = hallByHallId;
    }

    @ManyToOne
    @JoinColumn(name = "orderItem_id", referencedColumnName = "orderItem_id", nullable = false)
    public Orderitem getOrderitemByOrderItemId() {
        return orderitemByOrderItemId;
    }

    public void setOrderitemByOrderItemId(Orderitem orderitemByOrderItemId) {
        this.orderitemByOrderItemId = orderitemByOrderItemId;
    }
}
