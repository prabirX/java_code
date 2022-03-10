public class StatiClass{

    static int a=4;
    static int b;

    static{
        System.out.println("i am in the static block");
        b=a*5;
    }
    public static void main(String[] args) {
        StatiClass obj=new  StatiClass();

        System.out.println(obj.a +" "+obj.b);  // here the same also

      //  obj.a=obj.a+5;   //it will show a warning that "The static field StatiClass.a should be accessed in a static way"
          StatiClass.a=StatiClass.a+ 15;   //it is fine  now

        System.out.println(obj.a +" "+obj.b);  // in case of static variable it should  not be associated with the object name,it is same for all. so it should be accesed by the class name instead of the objects
        System.out.println(StatiClass.a +" "+StatiClass.b);  //print the same but no warning here


       StatiClass obj2=new StatiClass();                            //here oject also created but it will   not go to thr static block. Static block run only once when the first object created or  class get initialized first
       System.out.println(StatiClass.a +" "+StatiClass.b);


    }
}