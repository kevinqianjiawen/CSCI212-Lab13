import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Driver extends JPanel {
  private int Width = 600;
  private int Height = 600;
  private RandomColor background;
  
  private JButton change;
  private JButton text;
  
  private JFileChooser fc;
  private JTextArea log;
  private JScrollPane logScrollPane;
  
  
  public Driver(){
    change = new JButton("change background color");
    text = new JButton("Select File");
    
    
    
    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(Width, Height));
    

    add(change, BorderLayout.PAGE_END);
    
                     
    background = new RandomColor();
    //setBackground(background.getColor());

    
    fc = new JFileChooser();
    text.addActionListener(new textListener());
    add(text, BorderLayout.PAGE_START);
    
    log = new JTextArea(5,20);
    log.setMargin(new Insets(5,5,5,5));
    log.setEditable(false);
    log.setOpaque(true);
    log.setBackground(Color.blue);
    logScrollPane = new JScrollPane(log);
    //JViewport viewport = new JViewport();
    //viewport.setOpaque(false);
    //logScrollPane.setViewport(viewport);
    //logScrollPane.getViewport().setBackground(background.getColor());
    add(logScrollPane, BorderLayout.CENTER);
    
    change.addActionListener(new changeListener());
    
    
  }
  private class changeListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      //logScrollPane.getViewport().setBackground(background.getColor());
      log.setBackground(background.getColor());
    }
  }

  private class textListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      int retValue = fc.showOpenDialog(null);
      
      if (retValue == 0){
      File file = fc.getSelectedFile();
      //This is where a real application would open the file.
      WordCount w = new WordCount(file);
            
      log.append(w.getFrequencies());
      }
    }
  }
  public static void main(String[] args){
    
  }
  
}