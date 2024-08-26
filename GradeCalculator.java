/*Codsoft Virtula intership in java programming
 * Task 2 :  Student Grade Calculator
 * Author : Vivek Kumar Singh
 */

import java.util.Scanner;
class Student 
{
   public void calculate(double[] marks)
   {
      Double total_marks=0.0;
      String result="Pass";
      for(int i=0;i<marks.length;i++)
      {
        if(marks[i]<35)
        {
            result="Fail";
        }
        total_marks+=marks[i];
      }

      Double percentage=total_marks/marks.length;
      String grade="";

    if(percentage>96 && percentage<=100)
     grade="A+";

    else if(percentage>92 && percentage<=96)
     grade="A";

    else if(percentage>89 && percentage<=92)
     grade="A-";

    else if(percentage>86 && percentage<=89)
     grade="B+";

    else if(percentage>82 && percentage<=86)
     grade="B";

    else if(percentage>79 && percentage<=82)
     grade="B-";

    else if(percentage>76 && percentage<=79)
     grade="C+";

    else if(percentage>72 && percentage<=76)
     grade="C";

    else if(percentage>69 && percentage<=72)
     grade="C-";

    else if(percentage>66 && percentage<=69)
     grade="D+";

    else if(percentage>=65 && percentage<=66)
     grade="D";
   
     else
     grade="F";


    System.out.println("-- Student Result Details --");
    System.out.println("Total Marks : "+total_marks);
    System.out.println("Percentage  : "+percentage);
    System.out.println("Grade       : "+grade);
    System.out.println("Result      : "+result);

   }
}
public class GradeCalculator
 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       double marks[]=new double[5];

       for(int i=0;i<marks.length;i++)
       {
         try
           {
            System.out.println("Enter the marks of Subject "+(i+1)+" : ");
             marks[i]=sc.nextDouble();
           }
         catch(Exception e)
          {
            System.out.println(e.getMessage());
          }
       }

       Student object = new Student();
       object.calculate(marks);
    }
}
