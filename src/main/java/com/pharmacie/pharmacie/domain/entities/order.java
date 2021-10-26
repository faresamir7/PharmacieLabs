package com.pharmacie.pharmacie.domain.entities;
//
//import java.util.HashMap;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    int orderID;
//    int clientID;
//    
//    HashMap<Integer,Integer> medList;
//    boolean hasBeenProcessed;
//    
//    public order() {
//    }
//
//    public order(int orderID, int clientID, HashMap<Integer, Integer> medList, boolean hasBeenProcessed) {
//        this.orderID = orderID;
//        this.clientID = clientID;
//        this.medList = medList;
//        this.hasBeenProcessed = hasBeenProcessed;
//    }
//
//    public int getOrderID() {
//        return orderID;
//    }
//
//    public void setOrderID(int orderID) {
//        this.orderID = orderID;
//    }
//
//    public int getClientID() {
//        return clientID;
//    }
//
//    public void setClientID(int clientID) {
//        this.clientID = clientID;
//    }
//
//    public HashMap<Integer, Integer> getMedList() {
//        return medList;
//    }
//
//    public void setMedList(HashMap<Integer, Integer> medList) {
//        this.medList = medList;
//    }
//
//    public boolean isHasBeenProcessed() {
//        return hasBeenProcessed;
//    }
//
//    public void setHasBeenProcessed(boolean hasBeenProcessed) {
//        this.hasBeenProcessed = hasBeenProcessed;
//    }
//
//    
//}
