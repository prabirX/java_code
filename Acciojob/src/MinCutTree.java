import java.util.*;
public class MinCutTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        int r = 0;
        for(int i = 0; i < n; i++){
          a[i] = sc.nextInt();
          r = Math.max(r, a[i]);
        }
        int l = 0, ans = -1;
        while(l <= r){
          int mid = (l + r) / 2;
          int collected = 0;
          for(int i = 0; i < n; i++){
            collected = collected+ Math.max(0, a[i] - mid);
          }
          if(collected <= k){
            ans = mid;
            r = mid - 1;
          }else{
            l = mid + 1;
          }
        }
        System.out.println(ans);
        sc.close();
    }
    
}
