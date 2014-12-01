import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class World1 here.
 * 
 * @author Kevin Verweij 
 * @version 1.0
 */
public class World1 extends World
{

    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Input namePrompt = new Input("Wat is uw naam?");
        String name = namePrompt.getStringInput();
        
        Input ageInput = new Input("Wat is uw leeftijd?");
        int age= ageInput.getIntInput();
        if((age > 23 ) || (age < 13 )){
            System.out.println("U bent te jong of te oud.");
            exit game
        }else{
            System.out.println("Start game");
        }
        
        System.out.println(name);
        System.out.println(age);
    }



}
