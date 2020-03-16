
 


import java.util.Scanner;
public class JavaBasicExam2
{
  
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int summ=0;
    while(n>0)
    {
      int remm = n%10;
      if(remm%2!=0)
      {
        summ = summ+remm;
      }
      n = n/10;
    }
    
    if(summ%2==0)
    {
      System.out.println("Sum of odd digits is even");
    }
    else
    {
      System.out.println("Sum of odd digits is odd");
    }
    
  }
}

