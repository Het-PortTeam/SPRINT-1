import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Douane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Douane extends World
{

    public long currentTime = System.currentTimeMillis();   // Later (for example in an act() method), do:
    public int timer = 0;
    public Douane()
    {    
        super(1280, 720, 1); 
        addObject(new BackButton(), 75, 50);
        addObject(new DVrachtwagen(), 200, 350);
        addObject(new DDoorgaan(), 300, 600);
        addObject(new DControle(), 1000, 600);
        addObject(new DScanner(), 850, 310);
    }
    
    public void act()
    {

       if( currentTime + 1000 <  System.currentTimeMillis() )
    {
        timer += 1;
    }
    
    if( timer == 1000)
    {
        addObject(new DVrachtwagen(), 200, 350);
        timer = 0;
    }
    }
    
}



