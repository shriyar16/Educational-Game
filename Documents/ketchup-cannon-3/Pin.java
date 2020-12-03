import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pin extends Actor
{
    //private int counter = 0; 
    
    int xLoc; //int variable for the x location
    int yLoc; //int variable for the y location
    boolean isCorrectAnswer; //boolean variable to test whether the answer is correct
    public Pin()
    {
        xLoc = 0; //initially, the x and y location variables are set to 0
        yLoc = 0; 
        isCorrectAnswer = false; //sets this boolean variable to false initially
    }
    public Pin(int x, int y, boolean correctA) //this method contains the parameters of xLoc, yLoc, and isCorrectAnswer
    {
        xLoc = x;
        yLoc = y; 
        isCorrectAnswer = correctA;
      
    }
    /**
     * Act - do whatever the pin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //act method for the pins
    {
     if (isCorrectAnswer == true && Greenfoot.mouseClicked(this)) 
     //boolean statement to evaluate whether the correct pin has been clicked 
        {
         GreenfootImage correct = new GreenfootImage (200, 30); //new image object
         correct.drawString ("Correct!",2, 20); //the string "Correct!" is displayed
         setImage(correct);
         Greenfoot.delay(5); //wait
         //int counter = 1;
         if (((Destination) getWorld()).currentLocation.equals("Melbourne, Australia"))
            Greenfoot.stop();
         Greenfoot.setWorld(new Destination()); //go to a new country with a new question by reseting the world
        }
     if (isCorrectAnswer == false && Greenfoot.mouseClicked(this))
     //boolean statement to evaluate whether the wrong pin has been clicked
        {
          GreenfootImage wrong = new GreenfootImage (200,30); //new image object
          wrong.drawString("Wrong",2,20); //the string "Wrong" is displayed
          setImage(wrong);
          Greenfoot.delay(5); //wait
          //we decided not to have the question change until the user gets the question correct, so we did not reset the world
        }
            
    }
   
}
    

