//Main Method of Final Project 
import java.util.Scanner; 
import java.io.IOException;
import java.io.File;
import java.util.Arrays; 
import java.io.*; 

public class Final {
  public static void main (String [] args) { 
        //Scanner in = new Scanner(System.in); 
        /*String[] q1Choices = {"1.Saint Nick and Kris Kringle", "2.Santa Claus"}; 
        String[] q2Choices = {"1.Sandy", "2.Cupid"}; 

        Question q1 = new Question("What are two other names for Santa Claus?", 0, q1Choices); 
        Question q2 = new Question("One of Santa's reindeer shares a name with a famous symbol of Valentine's Day. Which Reindeer is that?", 1, q2Choices); 
        Question[] questions = new Question[]{q1, q2}; */
        
        //Open File (325) 
        File file = new File("testFile.txt"); 
         
        
        //check if file exisits 
        if (!file.exists()) {
         System.out.println("file does not exisit"); 
         //exit program
         System.exit(0); 
        }
        
        //open files
        Scanner inputFile = new Scanner(file);
        while(inputFile.hasNext()) {
            //Read First Line of File 
           String question = inputFile.nextLine(); 
           System.out.println(question);
        }
        
        inputFile.close(); //close file
        
                
        /*for (Question q : questions) {
            System.out.println(q.getQuestion() + "\n" + Arrays.toString(q.getChoices()));
            int userInput = in.nextInt(); 

            if (isCorrectAnswer(q, userInput)) {
               System.out.println("Hooray! You have entered the correct answer");  
            } else {
               System.out.println("You have entered the wrong answer"); 
               
            } 
        }*/
        
     } //end of main method
     
  public static boolean isCorrectAnswer (Question q, int userInput) {
        if ( userInput == (q.getAnswer() + 1)) {
            return true; 
         } else {
            return false; 
         }
         
  } //end of correct method 
  
} //end of class


 /*Scanner in = new Scanner(System.in); 
      File file = new File("testFile.txt"); 

      while(in.hasNext()) { //read into file
            
      
      //int userInput = in.nextInt();
      }*/
  

