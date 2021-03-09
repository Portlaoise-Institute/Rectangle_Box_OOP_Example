
package com.mycompany.rectangleboxexample;

/**
 *
 * @author Student
 */
public class BoxDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Create a box object.
        Box myBox1 = new Box();

        // Display the volume of myBox1.
//        System.out.println("Volume: " + myBox1.getVolume());
      
        System.out.println("\nBox 1: \n"+myBox1.toString());

        // Create a box object.
        Box myBox2 = new Box(12.2, 3.5, 2.0);

        // Display the volume of myBox2.
//        System.out.println("Volume: " + myBox2.getVolume());
        
        System.out.println("\nBox 2: \n"+myBox2.toString());
        
    }
    
}
