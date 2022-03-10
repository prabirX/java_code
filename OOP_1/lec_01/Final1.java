public class Final1 {
    public static void main(String[] args) {
        final int bonus=12;
        System.out.println(bonus);
     //   bonus=67;  //it will show an error , final variable cant be change once it is just 
       final student obj1=new student();
    System.out.println(obj1.roll);

    obj1.roll=23;                            //we can change the value of the object after making it final also 
    System.out.println(obj1.roll);

   // obj1=new student(20);             but we cant reassign it through any value

    }
  

}

class student{
    int roll;

    student(){
        roll=14;
    }
    student(int n){
        this.roll=n;
    }
}
