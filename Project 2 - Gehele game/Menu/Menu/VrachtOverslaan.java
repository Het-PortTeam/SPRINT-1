import greenfoot.*; 

public class VrachtOverslaan extends World
{
    public VrachtOverslaan()
    {    
        super(1280, 720, 1); 
       
        addObject(new Kade(), 640, 360);
        addObject(new Rails(), 640, 360);
        addObject(new VOSchip(), 640,360);
        addObject(new VOSchip2(), 640, 0);
    }
}