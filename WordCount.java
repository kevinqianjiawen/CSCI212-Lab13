import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;


import java.util.HashMap;
import java.util.Set;

public class WordCount{
  private HashMap<String, Integer> frequency;

  File fileName;

  public WordCount(File file){
   
   frequency = new HashMap<>();
   fileName = file;
   
   try {
    Scanner scan = new Scanner(file);

    while(scan.hasNext()){
     String word = scan.next();
     if(frequency.containsKey(word)){
        frequency.replace(word, frequency.get(word) + 1);
     } else{
       frequency.put(word, 1);
     }
    }
   } catch (FileNotFoundException e){
    e.printStackTrace();
   }
  }
  
  public String getFrequencies(){
    String result ="";
    Set<String> keyset = frequency.keySet();
        for (String key : keyset) {
            int count = frequency.get(key);
            result +=key +": "+count+"\n";
        }
        return result;
    }
  


  
  public static void main(String[] args){
    
  }
}