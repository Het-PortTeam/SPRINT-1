import greenfoot.*; 


public class VrachtOverslaan extends World
{
    private String img;  
    private GifImage gif = new GifImage("water_gif_test2.gif");
    
    public VrachtOverslaan()
    {    
        super(1280, 720, 1); 
       
        addObject(new Kade(), 640, 360);
        addObject(new Rails(), 640, 360);
        // De trein
        addObject(new VOLocomotief(), 640, 695);
        addObject(new VOTrain(), 523, 698);
        addObject(new VOTrain(), 383, 698);
        // Tot hier!
        addObject(new VOSchip(), 640,442);
        addObject(new VOSchip2(), 640, 250);
        // De containers schip1:
        addObject(new VOConB1(), 990, 400);
        addObject(new VOConM(), 1005, 443);
        addObject(new VOConS(), 1020, 485);
        addObject(new VOConB2(), 945, 485);
        addObject(new VOConS(), 945, 443);
        addObject(new VOConM(), 900, 400);
        addObject(new VOConS(), 840, 402);
        addObject(new VOConB3(), 870, 443);
        addObject(new VOConM(), 855, 485);
        VOConB1 VOConB4 = new VOConB1();
        addObject(VOConB4, 765, 400);
        VOConM VOConM4 = new VOConM();
        addObject(VOConM4, 780, 443);
        VOConS VOConS4 = new VOConS();
        addObject(VOConS4, 795, 485);
        VOConB1 VOConB5 = new VOConB1();
        addObject(VOConB5, 720, 485);
        VOConS VOConS5 = new VOConS();
        addObject(VOConS5, 720, 443);  
        VOConM VOConM5 = new VOConM();
        addObject(VOConM5, 675, 400);
        VOConS VOConS6 = new VOConS();
        addObject(VOConS6, 615, 402);
        VOConB1 VOConB6 = new VOConB1();
        addObject(VOConB6, 645, 443);
        VOConM VOConM6 = new VOConM();
        addObject(VOConM6, 630, 485);
        // Tot hier!
        // De containers schip2:
        addObject(new VOConB(), 992, 203);
        addObject(new VOConM(), 1007, 246);
        addObject(new VOConS(), 1022, 290);
        // Tot hier!
        addObject(new VOGrijper(), 640,550);
        addObject(new VOCrane(), 640, 550);
        addObject(new VOgrijper20(), 500, 130);
        addObject(new VOCrane2(), 500, 360);
        //Einde
        addObject(new BackButton(), 75, 50);
    }
    public void act()
    {
        setBackground(gif.getCurrentImage());
    }
}