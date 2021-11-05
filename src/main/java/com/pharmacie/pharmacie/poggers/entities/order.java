package com.pharmacie.pharmacie.domain.entities;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long orderID;
    Long clientID;
    
    HashMap<Long,Integer> medList;
    boolean hasBeenProcessed;
    
    public order() {
    }

    public order(Long orderID, Long clientID, HashMap<Long, Integer> medList, boolean hasBeenProcessed) {
        this.orderID = orderID;
        this.clientID = clientID;
        this.medList = medList;
        this.hasBeenProcessed = hasBeenProcessed;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public HashMap<Long, Integer> getMedList() {
        return medList;
    }

    public void setMedList(HashMap<Long, Integer> medList) {
        this.medList = medList;
    }

    public boolean isHasBeenProcessed() {
        return hasBeenProcessed;
    }

    public void setHasBeenProcessed(boolean hasBeenProcessed) {
        this.hasBeenProcessed = hasBeenProcessed;
    }

    
}
