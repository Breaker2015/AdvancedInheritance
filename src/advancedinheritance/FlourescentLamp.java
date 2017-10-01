/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedinheritance;

/**
 *
 * @author Ronan
 */
public class FlourescentLamp extends Light{
   
    //override changeBulb
    public void changeBulb(){
    
        System.out.println("Change tube in Flourescent Lamp");
        System.out.println("Dispose of old tube properly");
    }
    
}
