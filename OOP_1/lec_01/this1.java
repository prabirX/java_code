
//call another costructor from a constructor through this keyword
public class this1 {
    public static void main(String[] args) {
        student s1=new student();                            // call to constructor 1
        System.out.println(s1.Name+" "+s1.rno+" "+s1.marks);
    }
}
class student{
    int rno;
    String Name;
    float marks; 

    student(){                                      //costructor 1
        this(12,"kunal",67f);                       // this means here new student(12,"kunal",67f)  // call to the constructor 2
    }
    
    student(int rno,String Name,float marks){         //constructor 2
        this.rno=rno;
        this.Name=Name;           
        this.marks=marks;      
     }

} 