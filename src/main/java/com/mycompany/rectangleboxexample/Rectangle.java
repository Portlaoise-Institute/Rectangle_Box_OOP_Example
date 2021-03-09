package com.mycompany.rectangleboxexample;


import java.util.*;

/**
 *  This class holds data of a Rectangle.
 */
public class Rectangle {

    //    Instance variables 
   
    private double length;  // To hold length of rectangle
    private double width;  // To hold width of rectangle

   /**
    *  The constructor initialize rectangle's 
    *  length and width with default value    
    */
    public Rectangle() {
        length = 0;
        width = 0;
    }

   /**
    *  The constructor accepts the rectangle's  
    *  length and width.   
    */
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width; 
    }

    /**
    *  The getArea method returns the area of 
    *  the rectangle.
    */
    public double getArea() {
       return length * width;
    }

   
    /**
    *  The getLength method returns the length of 
    *  the rectangle.
    */
    public double getLength() {
        return length;
    }

    /**
    *  The getWidth method returns the width of 
    *  the rectangle.
    */
    public double getWidth() {
        return width;
    }

    /**
    *  The setWidth method sets the width of 
    *  the rectangle.
    * @param width 
    * @return void
    */
    public void setWidth(double width) {
        this.width = width;

    }

    /**
     * The setLength method sets the length of 
     * the rectangle.
     * @param length 
     * @return void
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * The toString method returns the length and 
     * width of the rectangle as a String.
     * @return String
     */
    public String toString() {
        return "Length: "+length + 
               "\nWidth: "+width;
    }
    
    
} //end class