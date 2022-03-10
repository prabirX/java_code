public class SingletonCheck {
    public static void main(String[] args) {
   //  Singleton obj1=new Singleton();  // the constructor will not be visible here cause it is declared as private in its class
   //we can create object through the function "getInstance"

   Singleton objct1=Singleton.getInstance(); objct1.a=10;       System.out.println(objct1.a);   //10

   Singleton objct2=Singleton.getInstance();                    System.out.println(objct2.a);   //10

   Singleton objct3=Singleton.getInstance();                    System.out.println(objct3.a);   //10

 //the objct1 ,objct2,objct3 are just 3 reference variable , but they are pointing to the same object, that is firstly created

    }
}
