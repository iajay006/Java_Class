/* Inner Class or Nested Class

 Inner Classes are basically of 4 types
1. static inner class
2. Non-static inner class
3. Local Inner class
4. Anonymous inner class

Advantages
1.Logical grouping of classes
2.Increased Encapsulation

1. static inner class
    class X
     {
       static class Y
        {
         }
     }*/
class Demo80
  {
    static class X
     {
      static int k=100;
      }
    public static void main(String a[])
     {
      System.out.println(Demo80.X.k);
     }
  }