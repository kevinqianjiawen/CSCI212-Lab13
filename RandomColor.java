import java.util.Random;
import java.awt.Color;

//make random color

public class RandomColor{

  private Random random = new Random();
  
  public RandomColor(){
  }
  
  public Color getColor(){
    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();
    
    return new Color(r, g, b);
  } 
  
  public static void main(String[] args){
    
  }
}