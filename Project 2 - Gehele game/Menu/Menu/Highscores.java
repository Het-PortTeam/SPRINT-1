import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Highscores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Highscores extends World
{

    /**
     * Constructor for objects of class Highscores.
     * 
     */
    public Highscores()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject(new ScoreBoard(556, 257),getWidth()/3, getHeight()/3);
        addObject(new BackButton(), 75, 50);
    }
}
