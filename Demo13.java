//Passing an object to a Method
//Returning object from a method
class X
{
    int a;
 }
class Demo13
{
    X Display()
     {
      X ob=new X();
      ob.a=133;
      return ob;
     }
       public static void main(String a[])
        {
        Demo13 ob=new Demo13();
        X ob1=ob.Display();
        System.out.println(ob1.a);
        
         }
}
         