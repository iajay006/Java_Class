//Multilevel-nheritance
class X
{
     X()
     {
      System.out.println(" X class Constructor");
      }
     void show()
      {
       System.out.println("Class X show method");
      }
}
class Y extends X
{
    Y()
     {
      System.out.println(" Y class Constructor");
      }
     void Disp()
      {
      System.out.println("Class Y Disp method");
       }
}
class Z extends Y
{
    Z()
     {
      System.out.println(" Z class Constructor");
     }
}
class Demo37
{
    public static void main(String a[])
     {
      Z ob=new Z();  
       ob.show();
       ob.Disp(); 
     }
}