class A
{
   int x,y;
    A()
    {
     x=10;
     y=20;
    }
     void Disp()
     {
       System.out.println("X="+x+"   Y="+y);
      }
}
class B
{
  int p,q;
    B()
    {
     p=50;
     q=60;
    }
     void Disp()
     {
       System.out.println("P="+p+"   Q="+q);
      }
}
  
class Demo5
{
     public static void main(String a[])
      {
       A ob=new A();
       B ob1=new B();
       ob.Disp();
       ob1.Disp();
       }
}
   