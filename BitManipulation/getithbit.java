package BitManipulation;

import java.util.*;

public class getithbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int x=sc.nextInt();
        int i=(1<<x);
        
        int ans=n&i;
        if(ans==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
