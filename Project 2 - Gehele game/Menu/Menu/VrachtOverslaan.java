import greenfoot.*; 


public class VrachtOverslaan extends World
{
    private String img;  
    private GifImage gif = new GifImage("water_gif_test2.gif");
    public long currentTime = System.currentTimeMillis();   // Later (for example in an act() method), do:
    public int timer = 0;
    public int explainOnce = 1;
    public double Difficulty = 1; 
    Counter Counter = new Counter();
    
    public VrachtOverslaan()
    {
        super(1280, 720, 1); //wereld
        //setPaintOrder(VOCrane.class, VOGrijper.class, VOCrane2.class, VOgrijper20.class, VOConS.class, VOConB.class, VOConM.class, VOTrain.class, VOLocomot.class);
       
        //kade
        addObject(new Kade(), 640, 360);
        addObject(new Rails(), 650, 694);
        
        // De trein
        addObject(new VOLocomotief(), 640, 695);
        addObject(new VOTrain(), 523, 698);
        addObject(new VOTrain(), 383, 698);
        // Tot hier!
        
        //schepen
        addObject(new VOSchip(), 640,442);
        addObject(new VOSchip2(), 640, 250);
        
        // De containers schip1:
        //VOConB "Rood"
        addObject(new VOConB1(), 990, 400);
        addObject(new VOConB2(), 945, 485);
        addObject(new VOConB3(), 870, 443);
        addObject(new VOConB4(), 765, 400);
        addObject(new VOConB5(), 720, 485);
        addObject(new VOConB6(), 645, 443);
        addObject(new VOConB7(), 540, 400);
        addObject(new VOConB8(), 495, 485);
        addObject(new VOConB9(), 420, 443);
        addObject(new VOConB10(), 315, 400);
        
        //VOConM "Groen"
        addObject(new VOConM1(), 1005, 443);
        addObject(new VOConM2(), 900, 400);
        addObject(new VOConM3(), 855, 485);
        addObject(new VOConM4(), 780, 443);
        addObject(new VOConM5(), 675, 400);
        addObject(new VOConM6(), 630, 485);
        addObject(new VOConM7(), 555, 443); 
        addObject(new VOConM8(), 450, 400);
        addObject(new VOConM9(), 405, 485);
        addObject(new VOConM10(), 330, 443);
        
        //VOConS "Geel"
        addObject(new VOConS1(), 1020, 485);
        addObject(new VOConS2(), 945, 443);
        addObject(new VOConS3(), 840, 402);
        addObject(new VOConS4(), 795, 485);
        addObject(new VOConS5(), 720, 443);
        addObject(new VOConS6(), 615, 402);
        addObject(new VOConS7(), 570, 485);
        addObject(new VOConS8(), 495, 443);
        addObject(new VOConS9(), 390, 400);
        addObject(new VOConS10(), 345, 485);
       
        // Tot hier!
        
        // De containers schip2:
        //VOConB tegenstander "Rood"
        addObject(new VOConB(), 992, 203);
        
        //VOConM tegenstander "Groen"
        addObject(new VOConM(), 1007, 246);
        
        //VOConS tegenstander "Geel"
        addObject(new VOConS(), 1022, 290);
        
        // Tot hier!
        addObject(new VOGrijper(), 640,550);
        addObject(new VOCrane(), 640, 550);
        addObject(new VOgrijper20(), 500, 130);
        addObject(new VOCrane2(), 500, 188);
        //Einde
        addObject(new BackButton(), 75, 50);
        addObject(new VOPlek(), 640, 400);
        addObject(new VOPlek2(), 640, 486);
        
        //counter
        Counter = new Counter("Punten: ");
        addObject(Counter, 301, 33);
    }
 
    public Counter getCounter()
    {
        return Counter;
    }
    
    public void act()
    {
        int CounterValue = Counter.getValue();
        setBackground(gif.getCurrentImage());
        if( currentTime + 1000 <  System.currentTimeMillis() )
       {
           timer += Difficulty;
       }
    
       if( timer == 3000)
       {
           timer = 0;
           
           addObject(new VOLocomotief(), 640, 695);
           addObject(new VOTrain(), 523, 698);
           addObject(new VOTrain(), 383, 698);
           
           //System.out.print(Difficulty);
       }
       
              if(CounterValue % 25 == 0 && CounterValue > 0)
       {
           Difficulty = CounterValue / 25;
        }
    }
}