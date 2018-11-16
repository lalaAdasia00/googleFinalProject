//Class for Questions 

public class Question {
  public String question; 
  public int posRightAnswer; 
  public String[] answers; 
  
  public Question(String question, int posRightAnswer, String[] answers) {
    this.question = question; 
    this.posRightAnswer = posRightAnswer; 
    this.answers = answers; 
  }
  
  public Question() {
    question = null; 
    posRightAnswer = 0; 
    answers = null; 
  }

} //end of class 

