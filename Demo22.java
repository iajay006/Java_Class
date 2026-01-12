import java.io.*;
class Facto
{
   int x;
    void getData()throws IOException
     {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter any number");
      x=Integer.parseInt(br.readLine());
      }
     void Factorial()
      {
       int i,fact=1;
       for(i=1;i<=x;i++)
        {
        fact=fact*i;
         }
       System.out.println("Factorial value="+fact);
    }
}
        
       
class Demo22
{
       public static void main(String a[])throws IOException
       {
        Facto ob=new Facto();
         ob.getData();
         ob.Factorial();
       } 
}
