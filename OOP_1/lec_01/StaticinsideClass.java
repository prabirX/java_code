/*class Test{
    static String Name;
    Test(String nam){
  //      this.Name=nam;   // have the same effect but static member should be independent of the object
     Test.Name=nam; 
  }
} */

///the class is out side and we can now create an object of it and can be  use  all the data member also , but once we make it declare in side  the class "StaticinsideClass "
// we cant access the things cause it will be totally depended on the outside class, without the object of the outside class, we cant access it but we can access it
// once we make the inside class as statica.

public class StaticinsideClass {

  static  class Test{
         String Name;   //if this will be static then every object have same value  , but if the class is just static then object can have different value
        Test(String nam){
         this.Name=nam; 
      }
    }




    public static void main(String[] args) {
        Test a=new Test("prabir");
        Test b=new Test("kunal");

        System.out.println(a.Name);//kunal
        System.out.println(b.Name); //kunal

    }
}
