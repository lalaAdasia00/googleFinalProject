//Main Method of Final Project 
import java.util.Scanner; 
import java.io.IOException;
import java.io.File;
import java.util.Arrays; 
import java.io.*; 

public class Final {
  public static void main (String [] args) throws IOException { 
        Scanner in = new Scanner(System.in); 
        /*String[] q1Choices = {"1.Saint Nick and Kris Kringle", "2.Santa Claus"}; 
        String[] q2Choices = {"1.Sandy", "2.Cupid"}; 

        Question q1 = new Question("What are two other names for Santa Claus?", 0, q1Choices); 
        Question q2 = new Question("One of Santa's reindeer shares a name with a famous symbol of Valentine's Day. Which Reindeer is that?", 1, q2Choices); 
        Question[] questions = new Question[]{q1, q2}; */
        
        //Stores File (325) 
        File file = new File("testFile.txt"); 
                 
        //open files
        Scanner inputFile = new Scanner(file);
        
                
        while(inputFile.hasNext()) {
            //stores question and then prints 
           String question = inputFile.nextLine(); 
           System.out.println(question); 
           //int userInput = in.nextInt(); 
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


   
/*while(inputFile.hasNext()) {
            //Reads Question and the prints it out
           String question = inputFile.nextLine(); 
           System.out.println(question); 
           
        }*/

