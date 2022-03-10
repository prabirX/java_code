public class Sequence {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int n=16;
    //    System.out.println(n+" ");
        Seq(n);
    }
    static void Seq(int n){
          if(n<=0){
              System.out.print(n+" ");
              return;
          }
         System.out.print(n+" ");
         Seq(n-5);
         System.out.print(n+" "); 
         
    }
    
}
