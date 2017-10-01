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
public class HalogenLight extends Light{
    
    @Override
    public void changeBulb(){
        System.out.println("Change bulb in Halogen Light");
        System.out.println("Dont touch the bulb with your bare hands");
    }
    
}
