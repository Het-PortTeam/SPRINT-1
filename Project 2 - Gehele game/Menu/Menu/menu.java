import greenfoot.*; 

public class menu extends World
{   
    public menu()
    {    
        super(1280, 720, 1); 
        /*
        Input namePrompt = new Input("Wat is uw naam?");
        String name = namePrompt.getStringInput();

        Input ageInput = new Input("Wat is uw leeftijd?");
        int age= ageInput.getIntInput();
         */
        addObject(new VOMenu(), 340, 360);
        addObject(new CCMenu(), 740, 520);
        //addObject(new BEMenu(), 500, 500);
        //addObject(new DMenu(), 300, 700);
        //addObject(new HMenu(), 900, 500);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}
