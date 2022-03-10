public class Singleton {
    int a;
    private Singleton(){   //private constructor no one out side class can access

    }

    private static Singleton instance; //creating a reference variable of Singleton class type
// by this more than one object creation is not possible
    public static Singleton getInstance(){               //static method so inependent of the object and call using the class name
        //check whether a object is created or not
        if(instance==null){                           //if a object will have created before then it will just return that same object
            instance=new Singleton();  //initialising to the object
        }
        return instance;
    }
}
