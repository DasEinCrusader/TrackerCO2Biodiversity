/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.co2trackerbiodiversity;

/**
 *
 * @author 35385
 */
public interface StackInterface {
    public void push(Object e);
    public Object pop();
    public Object peek();
    public boolean isEmpty();
    public int size();
    public String displayStack();
}
