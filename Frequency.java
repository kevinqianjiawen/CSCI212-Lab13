public class Frequency {
  private String string;
  private int count;
  
  public Frequency(String s){
    this.string = s;
    this.count = 1;
  }
  
  public int count(){
    return this.count;
  }
  
  public void incrementCount(){
    count++;
  }
  
  public String getString(){
    return this.string;
  }
 
}