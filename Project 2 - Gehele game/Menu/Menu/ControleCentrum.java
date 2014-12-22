import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControleCentrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControleCentrum extends World
{    
    private String img;  
    private GifImage gif = new GifImage("water_gif_test2.gif");  
    public long currentTime = System.currentTimeMillis();   // Later (for example in an act() method), do:
    public int timer = 0;

    public ControleCentrum()
    {    
        super(1280, 720, 1); 
        addObject(new CCLand1(), 100, 495);
        addObject(new CCLand2(), 1190, 565);
        addObject(new CCBoei(), 400, 300);
        addObject(new CCBoei(), 650, 300);
        addObject(new CCBoei(), 900, 300);
        addObject(new CCKade(), 400, 570); 
        addObject(new CCKade(), 650, 570);
        addObject(new CCKade(), 900, 570);
        addObject(new CCSchip(), 1200, 200);
        addObject(new CCplek(), 280, 590); 
        addObject(new CCplek(), 527, 590);
        addObject(new CCplek(), 777, 590);
        addObject(new CCplek(), 1027, 590);

    }
        
        
    
    public void act()
    {
        setBackground(gif.getCurrentImage());
       // Greenfoot.playSound("CC.mp3");
       
       if( currentTime + 1000 <  System.currentTimeMillis() )
    {
        timer += 1;
    }
    
    if( timer == 300)
    {
        addObject(new CCSchip2(), 1200, 200);
    }
    }
    
}


