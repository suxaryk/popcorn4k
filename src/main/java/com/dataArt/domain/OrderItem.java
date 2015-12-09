package com.dataArt.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 2515486456099682307L;
    private int id;
    private int amount;
    private Ticket ticket;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount", nullable = false, insertable = true, updatable = true)
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderitem = (OrderItem) o;

        if (id != orderitem.id) return false;
        if (amount != orderitem.amount) return false;

        return true;
    }

    @OneToOne
    @JoinColumn(name = "ticket_id", referencedColumnName = "id", nullable = false)
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + amount;
        return result;
    }
}
