public class Constructor {
    public static void main(String[] args) {
          student s1=new student();
        System.out.println(s1.rno+ " "+s1.Name+" "+s1.marks); 

        student s2=new student(12,"Shaswat",23.0f); 
        System.out.println(s2.rno+ " "+s2.Name+" "+s2.marks); 

        student s3=new student(s1);                               //take s1 object as arguments and acess its value to the s3
        System.out.println(s3.rno+ "-"+s3.Name+" "+s3.marks); 
        s3=new student(s2);
        System.out.println(s3.rno+ "?"+s3.Name+" "+s3.marks);  //initialize many times, but if it was final then it is not possible


        student s4=s3;   //it dont make copy of that objct to s4, it just create the copy of the reference var of s3 to s4, they are pointing to the same object in the heap
        System.out.println(s4.rno+ " "+s4.Name+" "+s4.marks); 
        s3.marks=10f;  s4.rno=22;
        System.out.println("s3.marks: "+s3.marks+"  s4.marks: "+s4.marks +"  \ns3.rno: "+s3.rno+"  s4.rno: "+s4.rno);  //changing the value of the s3 also reflects to the s4 AND vice versa
    }
}

class student{
    int rno;
    String Name;
    float marks;            
    
    student(){
        this.rno=13;                //this is refering to the cuurent object
        this.Name="prabir";
        this.marks=78.9f;
    }
    student(int rno,String naam,float marks){
        this.rno=rno;
      //rno=rno;                  //compiler can't distinguish what is datamember of that object and what is the argument that is to be passed to the member, without "this" . so assign the default value to it
        Name=naam;             //no problem,if the arguments and the data member has different name
        this.marks=marks;      //but if the argument and the data member has same name then "this" keyword is necessery, in order tp distinguish betweent the data member and the arguments pass to the function
     }
     
     student (student s){
         this.rno=s.rno;
         this.Name=s.Name;
         this.marks=s.marks;
     }
}
