import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question9 extends Actor
{
    /**
     * Act - do whatever the Question9 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question9()
    {
    GreenfootImage img = new GreenfootImage (500, 40); //new image object
    img.drawString ("Where is the Red Square located?", 2, 30); //displays the question text
    setImage(img);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}
