/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co2trackerbiodiversity;

/**
 *
 * @author 35385
 */
public abstract class MyTripList implements LinearListInterface{
    private Node head;
    private Node last;
    private Node curr;
    private int size;
    
    public MyTripList(){
        head = null;
        last = null;
        size = 0;
        curr = head;
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
   
    public int size(){
        return size;
    }
    private void setCurrent(int index){
        curr = head;
        for(int i = 1; i < index; i++){
            curr = curr.getNext();
        }
    }
    
}
