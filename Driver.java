import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Driver extends JPanel {
  private int Width = 600;
  private int Height = 600;
  private RandomColor background;
  
  private JButton change;
  private JButton text;
  
  public Driver(){
    change = new JButton("change background color");
    text = new JButton("Select File");

    change.addActionListener(new changeListener());
    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(Width, Height));
    add(change, BorderLayout.PAGE_END);
    
                     
    background = new RandomColor();
    setBackground(background.getColor());

    text.addActionListener(new textListener());
    add(text, BorderLayout.PAGE_START);
  }
  private class changeListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      setBackground(background.getColor());
    }
  }

  private class textListener implements ActionListener{
    public void actionPerformed(ActionEvent e){

    }
  }
  public static void main(String[] args){
    
  }
  
}