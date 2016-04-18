import javax.swing.JFrame;

public class Window extends JFrame{
  
  public Window(){
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    f.getContentPane().add(new Driver());
    f.pack();
    f.setVisible(true);
  }
  public static void main(String[] args){
    Window a = new Window();
  }
}