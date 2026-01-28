//Multilevel-nheritance
class X
{
     void show()
      {
       System.out.println("Class X show method");
      }
}
class Y extends X
{
}
class Z extends Y
{
    Z()
     {
      super.show();
     }
}
class Demo36
{
    public static void main(String a[])
     {
      Z ob=new Z();   
     }
}