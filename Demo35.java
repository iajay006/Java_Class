/*Inheritance:-It is the feature of object orientation that supports code reusablity.
                or
               It is the property by which derived class acquare the property of base class.

      Syntax:-
      class A
      {
       /////
       }
       class B extends A
       {
        ///
       }*/

//Single Inheritance
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
class Demo35
{
    public static void main(String a[])
     {
      Y ob=new Y();
       ob.show();
     }
}