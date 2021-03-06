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
public class GasFireplace implements Switchable {
    private Status status;

    public void turnOn() {
        status = Status.ON;
        // turn on the gas, ignite the flame
    }
    public void turnOff() {
        status = Status.OFF;
        // turn off the gas
    }
    @Override
    public String toString() {
        String className = this.getClass().getName();
        return "The " + className + " is turned "
                + status.toString().toLowerCase();
    }
}
