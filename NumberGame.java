/*Codsoft Virtual Internship in Java Programming
 * TASK 1 : Number Game
 * Author Name : Vivek Kumar Singh
 */

 import java.util.Scanner;
 import java.util.Random;

 class Game 
 {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int guessNo;
    
    public Game()
    {
       guessNo = rd.nextInt(100)+1;
    }

    public void play()
    {
        boolean guessStatus=false;
        int count=0;

        while(!guessStatus)
        {
            System.out.println("Guess A Number Between 0 to 100 : ");
            int ourGuess = sc.nextInt();
            count++;
            
            if(ourGuess>=1 && ourGuess<=100)
            {
                if(ourGuess==guessNo)
                {
                    System.out.println("Congratulation! You have Guessed in "+count+" Guess Count");
                    guessStatus=true;
                }
                else if(ourGuess>guessNo)
                {
                    System.out.println("Too High");
                }
                else
                System.out.println("Too Low");
            }
            else 
            {
                System.out.println("You Have Guessed Out of Limits!");
            }

        }
    }
 }

 public class NumberGame
 {  
    public static void main(String args[])
    {
        Game ob = new Game();
        ob.play();
    }
 }
