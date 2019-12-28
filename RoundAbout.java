import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Main Class
 *
 * @author Chris Fishback
 * @version uno
 */
public class RoundAbout extends JPanel implements MouseListener
{
    public static Color color;
    public static ArrayList<Light> lights = new ArrayList<Light>();
    public static boolean stop = false;
    
    public static void main(String[] args) 
    {
        setLightInfo();
        
        /*
        JFrame myFrame = new JFrame();
        RoundAbout animate = new RoundAbout();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1000,1000);
        myFrame.add(animate);
        myFrame.setVisible(true);
        */
        
        JFrame myFrame = new JFrame();
        myFrame.addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent e) 
            {
                System.exit(0);
            };
        });
        myFrame.setSize(1000, 1000);
        myFrame.setResizable(false);
        RoundAbout animate = new RoundAbout();
        myFrame.add(animate);
        animate.addMouseListener(animate);
        myFrame.setVisible(true);
        
        
        while(true) 
        {
            for (Light node : lights)
            {
                if(!stop)
                {
                    node.color = Color.GREEN;
                    myFrame.repaint();
                    
                    try{
                        TimeUnit.MILLISECONDS.sleep(30);
                    }catch(InterruptedException e){}
                    
                    node.color = Color.RED;
                }   
            }
        }
    }
    
    public void paint(Graphics canvas)
    {
        canvas.setColor(Color.RED);
        
        this.placeLights(canvas);
    }
    
    public void placeLights(Graphics canvas)
    {
        int diameter = 55;
        int count = 0;
        
        for (Light node : lights) { 
            if(count > 11)
                diameter = diameter + 2;
            else
                diameter = diameter - 2;
            
            canvas.setColor(node.color);
            canvas.fillOval(node.getX(),node.getY(), diameter, diameter);
            
            count++;
        } 
    }
    
    public static void setLightInfo()
    {
        //create list of lights of length 15
        for(int i = 0; i <= 19; i++)
        {
            lights.add(new Light());
        }
        
        //-----set position for all 15 lights-----\
        //light1 -- middle light
        lights.get(0).setX(475);
        lights.get(0).setY(585);
        
        //--- left side --- \\
        
        //light2 - -
        lights.get(1).setX(350);
        lights.get(1).setY(570);
        
        //light3 - -
        lights.get(2).setX(230);
        lights.get(2).setY(530);
        
        //light4 - -
        lights.get(3).setX(130);
        lights.get(3).setY(470);
        
        //light5 - - 
        lights.get(4).setX(110);
        lights.get(4).setY(410);
        
        //light6 - -
        lights.get(5).setX(165);
        lights.get(5).setY(370);
        
        //light7 - -
        lights.get(6).setX(230);
        lights.get(6).setY(350);
        
        //light8 - -
        lights.get(7).setX(290);
        lights.get(7).setY(340);
        
        //light9 - -
        lights.get(8).setX(355);
        lights.get(8).setY(337);
        
        //light10 - -
        lights.get(9).setX(420);
        lights.get(9).setY(336);
        
        
        //---- middle ----\\
        
        //light11 - 
        lights.get(10).setX(485);
        lights.get(10).setY(335);
        
        //---- Right side of circle ----\\
        
        //light12 -
        lights.get(11).setX(540);
        lights.get(11).setY(336);
        
        //light13 -
        lights.get(12).setX(595);
        lights.get(12).setY(337);
        
        //light14 -
        lights.get(13).setX(655);
        lights.get(13).setY(340);
        
        //light15 -
        lights.get(14).setX(720);
        lights.get(14).setY(350);
        
        //light16 - 
        lights.get(15).setX(785);
        lights.get(15).setY(370);
        
        //light17 - 
        lights.get(16).setX(840);
        lights.get(16).setY(410);
        
        //light18 -
        lights.get(17).setX(820);
        lights.get(17).setY(470);
        
        //light19 -
        lights.get(18).setX(720);
        lights.get(18).setY(530);
        
        //light20 - 
        lights.get(19).setX(600);
        lights.get(19).setY(570);
        
    }
    
    public void mousePressed(MouseEvent e) {
        stop = !stop;
    }
    
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
