import java.util.*;


import java.util.Scanner;
class Palindrome
{

public static void main(String[] args)
{
//TODO Auto-generated method stub
  String str,rev="";
  Scanner s = new Scanner(System.in);
   System.out.println("enter string");
  str=s.nextLine();
  int length=str.length();
  for(int i=length-1;i>=0;i--)
  {
 rev=rev+str.charAt(i);
  }
   if(str.equals(rev))
   System.out.println("palindrome");
   else
   System.out.println("not palindrome");
   int sum=0;
   for(int i=length-1;i>=0;i--)
   {
   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
   {
   sum=sum+1;
   }
   }
   if(sum>=2)
   {
   System.out.println("string contains two vowels");
   }
   else
   System.out.println("no vowels");
}
}






