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
public class TV implements Switchable{
    
   
    private Status status;

    public void turnOn() {
        status = Status.ON;
        // turn on the tv
    }
    public void turnOff() {
        status = Status.OFF;
        // turn off the tv
    }
    @Override
    public String toString() {
        String className = this.getClass().getName();
        return "The " + className + " is turned "
                + status.toString().toLowerCase();
    }
}

    

