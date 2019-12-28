import java.awt.*;

/**
 * Light class
 *
 * @author Cfish
 * @version wi
 */
public class Light
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    public Color color;

    /**
     * Constructor for objects of class Light
     */
    public Light()
    {
        x = 0;
        y = 0;
        color = Color.RED;
    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
    public int getY()
    {
        return y;
    }
}
