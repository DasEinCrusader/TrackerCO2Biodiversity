/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co2trackerbiodiversity;

/**
 *
 * @author 35385
 */
public class MyLinkedList <T>{
    private class Node{
        T data;
        Node next;
        
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    private int size;
    
    public MyLinkedList(){
        head = null;
        size = 0;
    }
    
    public void add(T element){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
}
