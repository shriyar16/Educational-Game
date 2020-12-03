import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Machine class
 * 
 * @author Micheal Kolling
 * @author Amjad Altadmri 
 * @version 1.4
 */
public class Machine extends Actor
{
    /**
     * Act - move the Machine and fire in response to users'
     * pressed keys. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //checkKeys();
    }
    
    /**
     * CheckKeys - checks if the user pressed any of the specified
     * keys, then turn or fire the Machine accordingly
     */
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("left")) {
            turn( - 5 );
        }
        if(Greenfoot.isKeyDown("right")) {
            turn( + 5 );
        }
        //if( "space".equals(Greenfoot.getKey()) ) {
            fire();
        //}
    }
    
    /**
     * Fire - shots the Blob in the same direction of the
     * Machine, playing a suitable sound. 
     */
    private void fire()
    {
        if (Greenfoot.mouseClicked(null))
        {
          Greenfoot.playSound("pop.wav");
          
          MouseInfo mouseInfo = Greenfoot.getMouseInfo();
          int x = mouseInfo.getX();
          int y = mouseInfo.getY();
          
        }
    }
    
}
