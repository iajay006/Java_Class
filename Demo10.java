/*Static modifier:-static is keyword and is a modifier.static variable are declared outside the method and constructor.static variable or method can be accessed through class name,object and directly*/

class Demo10
{
     static void show()
      {
       System.out.println("static method");
      }
       public static void main(String a[])
        {
         show();
         Demo10.show();
         Demo10 ob=new Demo10();
         ob.show();
        }
}