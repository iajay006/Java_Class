//Passing an object to a Method
class X
{
    int a;
 }
class Demo12
{
    void Display(X ob)
     {
      System.out.println(ob.a);
     }
       public static void main(String a[])
        {
         X ob=new X();
         ob.a=100;
         Demo12 ob1=new Demo12();
         ob1.Display(ob);
         }
}
         