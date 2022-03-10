import java.util.Arrays;

public class class_1{
             public static void main(String[] args) {
            student stu1;                     //it just create a reference varible in the stack
            stu1=new student();               //dynamically allocate memory in the heap              
            System.out.println(stu1);            //null


            student[] stud3=new student[5];     //create an  array of objects of student class but it is pointing to null
            System.out.println(Arrays.toString(stud3)); //[null, null, null, null, null]
 
            System.out.println(stu1.rollNo);   //print the defult value 0

            stu1.Name="prabir";
            stu1.rollNo=23;
            stu1.marks=85f;

            System.out.println(stu1.Name+" "+stu1.rollNo+" "+stu1.marks);


    }
}
class student{
    int rollNo;
    String Name;
   // float marks=56f; 
    float marks; 
}