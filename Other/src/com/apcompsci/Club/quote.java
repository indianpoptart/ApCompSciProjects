import java.applet.Applet;
import java.awt.*;

public class quote extends Applet
{
    public void paint (Graphics page)
    {
        setBackground(Color.cyan);
        page.drawRect(50,50,40,40);
        page.drawRect(60,80,225,30);
        page.drawOval(75,65,20,20);
        page.drawLine(35,60,100,120);
        page.drawLine(70,75,100, 120);
        page.drawOval(35,60,75,10); 
        
        page.drawString("Don't Panic!", 110, 70);
        page.drawString("--Douglas Adams", 130, 101);

    }
}
