import java.awt.*;
import javax.swing.*;

public class DictionaryApplication extends JPanel{
    public void runApplication(){
        DictionaryApplication App = new DictionaryApplication();
        App.renderWindow();
    }
    public void renderWindow(){
        JFrame f = new JFrame("Twilight Zone");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new DictionaryApplication());
        f.setSize(290, 325);
        f.setLocation(550, 25);
        f.setVisible(true);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(10, 20, 150, 40);
        g2.setColor(Color.BLACK);
    }
    public static void main(String args[])  {
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        //dictionaryCommandline.dictionaryBasic();
        //dictionaryCommandline.dictionaryAdvanced();
        DictionaryApplication DicApp = new  DictionaryApplication();
        DicApp.runApplication();
    }

}
