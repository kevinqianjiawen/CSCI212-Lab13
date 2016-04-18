import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.ArrayList;

public class WordCount{
  private ArrayList<String> strings;
  private ArrayList<Frequency> frequency;

  File fileName;

  public WordCount(File file){
   strings = new ArrayList<>();
   frequency = new ArrayList<>();
   fileName = file;

   try {
    Scanner scan = new Scanner(file);

    while(scan.hasNextLine()){
     String line = scan.nextLine();
     String[] stringArr = line.split(" ");

     for(String s : stringArr){
      if(s.isEmpty()){
       continue;
      }
      if(strings.contains(s)){
       for(Frequency f: frequency){
        if(f.getString().equals(s)){
         f.incrementCount();
        }
       }
      } else {
       strings.add(s);

       frequency.add(new Frequency(s));
      }
     }
    }
   } catch (FileNotFoundException e){
    e.printStackTrace();
   }
  }
  
  public String getFrequencies(){
   String result = "";
        for (Frequency f : frequency) {
            result += f.getString() + ": " + f.count() + "\n";
        }
        return result;
    }
  


  
  public static void main(String[] args){
    
  }
}