import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question1 extends Actor
{
    /**
     * Act - do whatever the Question1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question1()
{
    GreenfootImage img = new GreenfootImage (200, 30); //new image object
    img.drawString ("Where is Winston Churchill from?", 2, 20); //displays the question text
    setImage(img); 
}
    public void act() 
    {
        // Add your action code here.
    }    
}
