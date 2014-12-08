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
    int speed = 7;
    
if(pointer != null)
{
   
    int mouseX = pointer.getX();
    int mouseY = pointer.getY();
    int button = pointer.getButton();
    turnTowards(mouseX, mouseY);
    
    
    //turnTowards(mouseX, mouseY);
    //setLocation(mouseX, mouseY);
    if( button == 1)
    {
        
        move(speed);
       
   
    }

}

 if ( plek != null )
 {
     
     setRotation(270);
     move(0);
     
    
 }

//if ( getY() >= 0 && getY() <= 299) { setRotation(0); } 

//if ( getY() >= 300) { setRotation(270); } 

if( x == 280 && y  == 200 ) { turn(270); move(0); }

 }    }