/*Scanner class
It is present in java.util package
import java.util.Scanner;
or
import java.util.*;
nextInt()
nextFloat()
nextBoolean()
nextByte()
nextLine()*/
import java.util.*;
class Facto
{
   int x;
    void getData()
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number");
      x=sc.nextInt();
      }
     int Factorial()
      {
       int i,fact=1;
       for(i=1;i<=x;i++)
        {
        fact=fact*i;
         }
      return(fact);
    }
}
        
       
class Demo24
{
       public static void main(String a[])       {
        int q;
        Facto ob=new Facto();
        ob.getData();
        q=ob.Factorial();
        System.out.println("Factorial value="+q);
       } 
}


