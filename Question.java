import java.util.Scanner; 
import java.io.IOException;
import java.io.File;
import java.util.Arrays; 
import java.io.*; 
//Class for Questions 

public class Question {
  public String question; 
  public int posRightAnswer; 
  public String[] choices; 
  public File file; 
  
  public Question(File file) {
  
  
  } 
  
  public Question(String question, int posRightAnswer, String[] choices) { //constructor
    this.question = question; 
    this.posRightAnswer = posRightAnswer; 
    this.choices = choices; 
  }
  
  public String getQuestion() { //gets the Question 
   return question; 
  }
  
  public String[] getChoices() { //gets the array of choices 
   return choices; 
  }
  
  public int getAnswer() { //return true of the pos of right answer is correct 
   return posRightAnswer; 
  }
  
} //end of class 

