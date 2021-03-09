package com.mycompany.rectangleboxexample;

import java.util.*;

/**
 * 
 */
public class Box extends Rectangle {

    /**
     *  instance variables 
     */
    private double height;

   
     /**
     * Default constructor
     */
    public Box() {
        // Call the superclass default constructor to
        // initialize length and width.
        super();
        //Initialize height.
        height = 0;
     
    }

    /**
     * @param length 
     * @param width 
     * @param height
     */
    public Box(double length, double width, double height) {
        // Call the superclass constructor to
        // initialize length and width.
        super(length, width);
      
        // Initialize height.
        this.height = height;
    }

    /**
     * @return
     */
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height 
     * @return
     */
    public void setHeight(double height) {
        this.height = height;

    }

    /**
     * @return
     * The toString method in the Box subclass 
     * is going to override the toString method
     * in the Rectangle super class 
     */
  
    @Override
    public String toString() {
        return super.toString() + "\nHeight: " + height+
                "\nVolume: " +getVolume();
    }
    
    
}