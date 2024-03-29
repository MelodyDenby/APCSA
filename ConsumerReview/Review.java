import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  //Activity 1: Tests sentiment for different words
  public static void reviewSentiment(){
    System.out.println(Review.sentimentVal("hapily"));
    System.out.println(Review.sentimentVal("terrible"));
    System.out.println(Review.sentimentVal("cold"));
    System.out.println("");
    System.out.println(Review.sentimentVal("awesome"));
    System.out.println(Review.sentimentVal("rotton"));
    System.out.println(Review.sentimentVal("super"));
  }

  //Activity 2: Finds the total sentiment 
   public static double totalSentiment(String filename){
  String reviewText= textToString(filename);
  int len=reviewText.length();
  int index=0;
  double sum=0.0;
  String currentWord="";
  while( index < len )
     {
       if( index == len-1 )
       {
         currentWord += reviewText.substring(index, index+1);
         currentWord = removePunctuation(currentWord);

         sum += sentimentVal(currentWord);
       }
       else if( !(reviewText.substring(index, index+1).equals(" ")))
       {
         currentWord += reviewText.substring(index, index+1);
       }
       else
       {
         currentWord = removePunctuation(currentWord);

         sum += sentimentVal(currentWord);
         currentWord = "";
        }
       index++;
     }
     return sum;
    }

    /*
    Activity 2.5: Determine star rating
    public static int starRating(String fileName){
      double totalSentiment= totalSentiment(fileName);
      if (totalSentiment<-10) {
        return 0;
      }
      else if (totalSentiment<0) {
        return 1;
      }
    }
*/
    //Activity 3
public static String fakeReview(String fileName)
   {
     String reviewWords = Review.textToString(fileName);
     String oneWord;
     String fakeReview = "";
    
     // doing the going through each word by finding spaces
     int spacePosition = reviewWords.indexOf(" ");
     while (spacePosition != -1)
     {
       oneWord = reviewWords.substring(0, spacePosition);
       //remove 
       reviewWords = reviewWords.substring(spacePosition +1);
       // Oh snap its an adjective replace that
       if (oneWord.substring(0, 1).equals ("*"))
       {
         String punctuation = getPunctuation(oneWord);
         String randomWord = randomPositiveAdj();
         fakeReview = fakeReview + randomWord + punctuation;
       }
       else
       {
         fakeReview += oneWord; // add word if it is not an adjective
       }
       fakeReview += SPACE; 
       spacePosition = reviewWords.indexOf(" ");
     } 
     // processing that last word
     if (reviewWords.substring(0, 1).equals ("*"))
     {
       String punctuation = getPunctuation(reviewWords);
       String randomWord = randomPositiveAdj();
       fakeReview = fakeReview + randomWord + punctuation;
     }
     else
     {
       fakeReview += reviewWords; // add word if it is not an adjective
     }
     return fakeReview;
   } 

  public static void main(String[] args){
    reviewSentiment();
    System.out.println("Activity 2 option 1- the sentiment of your review is " +totalSentiment("simpleReview.txt"));
    System.out.println("Activity 2 option 1- the sentiment of the Bic \"For Her\" Pens review is " +totalSentiment("pen.txt"));
  }
}
