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
     int Factorial()
      {
       int i,fact=1;
       for(i=1;i<=x;i++)
        {
        fact=fact*i;
         }
       //System.out.println("Factorial value="+fact);
      return(fact);
    }
}
        
       
class Demo23
{
       public static void main(String a[])throws IOException
       {
        int q;
        Facto ob=new Facto();
        ob.getData();
        q=ob.Factorial();
        System.out.println("Factorial value="+q);
       } 
}
