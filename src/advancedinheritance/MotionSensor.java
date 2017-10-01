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
public class MotionSensor {
    
    //fields
    private Switchable[] items;
    //know how many elements there are
    private int count = 0;
    
    
    //constructor : when i build a new one
    //I can pass in how many items I want it to store
    public MotionSensor(int numItems) {
        items = new Switchable[numItems];
    }
    
    //take switchable as arg
    //store s into the array an inc value of s
    public void add(Switchable s){
    
        if(count < items.length){
            items[count++] = s;
            //else throw exception
        }
        
    }
    
    public void motionDetected(){
    
        System.out.println("Motion Detected");
        //loop thru array 
        //each time store the current item
        for(Switchable item : items){
            if(item != null)
                item.turnOn();
        }
    }
    
    //after 10 mins no motion 
    //loop thru array again and turn off any items not null
    public void timeout(){
    
        System.out.println("Motion Detected");
        for(Switchable item : items){
            if(item != null)
                item.turnOff();
    }
    
}
    public String toString(){
    
        StringBuilder builder = new StringBuilder();
        for (Switchable item : items) {
            if (item != null)
                builder.append(item.toString() + "\n");
        }
        return builder.toString();
        
    
    }
     public static void main(String[] args) {
         //create the MS array of size 4
        MotionSensor sensor = new MotionSensor(5);
        //add 4 items
        //you can always substitute an implementing class where 
        //a an Interface is required : they all implement the interface
        sensor.add(new FlourescentLamp());
        sensor.add(new HalogenLight());
        sensor.add(new GasFireplace());
        sensor.add(new Fan());
        sensor.add(new TV());
        
        //this wont work : its an abstract class
        //CANNOT INSTANTIATE IT
        //sensor.add(new Light());

        sensor.motionDetected();
        System.out.println(sensor);
        sensor.timeout();
        System.out.println(sensor);
    }
    
    
}//class
    
