import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question5 extends Actor
{
    /**
     * Act - do whatever the Question5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question5()
    {
    GreenfootImage img = new GreenfootImage (500, 30); //new image object
    img.drawString ("Where is the Great Barried Reef located?", 2, 30); //displays the question text
    setImage(img);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}
