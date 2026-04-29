/*Non Static inner class:-If a class is declared within another class without using static modifier is treated as Non-Static inner class

class X
{
    class Y
     {
      }
}

1.A non static inner class non static member,access the static member of the outer class either directly or through outer class name
*/

class Demo84
{
   String name;
   static int age;
     private String getName(String n)
       {
        name=n;
        return name;
        }
      static int getAge(int a)
       {
        age=a;
        return age;
        }
        private class Demo
         {
          int roll;
          String add;
           int getRoll(int r)
            {
              roll=r;
              return roll;
             }
             String getAdderess(String s)
              {
                add=s;
                return add;
               }
                 void Disp()
                  {
                    System.out.println("Name="+getName("Ajay"));
                    System.out.println("Age="+Demo84.getAge(20));
                    System.out.println("Roll Number="+getRoll(27));
                    System.out.println("Address="+getAdderess("Ranchi")); 
                   } 
               }
          void show()
          {
           Demo ob1=new Demo();
           ob1.Disp();
           }
     public static void main(String a[])
      {
        Demo84 ob=new Demo84();
          ob.show();
        
        }
}

         