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
    //int mouseX = pointer.getX();
    //int mouseY = pointer.getY();
    //int button = pointer.getButton();
    //int count = pointer.getClickCount();

   
   if( x >281) { setLocation(getX() -2, getY() );} 
   if( x == 280) { setRotation(270); setLocation(getX(), getY()+1 ); }
   if( x== 280 && y == 590) { setLocation(280, 590 ); }
   
  }
}
