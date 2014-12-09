import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CCSchip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class CCSchip extends Actor
{
    /**
     * Act - do whatever the CCSchip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    MouseInfo pointer = Greenfoot.getMouseInfo();
    Actor plek = getOneIntersectingObject( CCplek.class );
    int x = getX();
    int y = getY();
    int speed = -2;
    int mouseX = pointer.getX();
    int mouseY = pointer.getY();
    int button = pointer.getButton();
    int count = pointer.getClickCount();
    setLocation(getX() +speed, getY());
    
    
  
 if( pointer != null) {  }
    
 if( x == 280 && y  == 200 ) { setLocation(280 -2, getY()); setRotation(270);}

 if ( plek != null )
 {
     
     setRotation(270);
     
     
    
 }



 }    
}