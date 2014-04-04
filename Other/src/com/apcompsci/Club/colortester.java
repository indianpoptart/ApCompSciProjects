/**
 * Testing the values of red
* @author (Jacques) 
 * @version (March 2011)
 */
import java.applet.Applet;
import java.awt.*;

public class colortester extends Applet
{
    public void paint (Graphics page)
    {
        int r = 0x00; 	// to tell the computer we’re using hex
        int g = 0x00;	// we need to preface it with “0x”
        int b = 0x00;
        int x = 0;
        int y = 0;
        
        for (int i = 255; i >= 0; i--)
        {
            page.setColor(new Color(220, 20, 31));
            page.drawOval(x, y, i, i);
            
            x = x + 2;
            y = y + 2;
            r = r + 0x01;
        }
    }
}
