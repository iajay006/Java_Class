class A
{
    static void show()
      {
       System.out.println("static method show");
      }
}
class Demo11
{
     static void Display()
      {
       System.out.println("static method Display");
        A ob=new A();
        ob.show();
        A.show();
      }
       public static void main(String a[])
        {
         Display();
         Demo11.Display();
         Demo11 ob=new Demo11();
         ob.Display();
        }
}