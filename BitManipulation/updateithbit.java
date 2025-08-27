package BitManipulation;

import java.util.*;

public class updateithbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();

        int x=1<<i;
        int newbit=sc.nextInt();

        n=n&(~x);
        System.out.println(n);

        int bm=newbit<<i;

        System.out.println(n|bm);


        //or
        // int n=sc.nextInt();
        // int i=sc.nextInt();

        // int x=1<<i;
        // int newbit=sc.nextInt();

        // if(newbit==0){
        //     n=n%(~x);
        //     System.out.println(n);
        // }else{
        //     n=n|x;
        //     System.out.println(n);
        // }
        
    }    
}
