package BitManipulation;

import java.util.*;

public class clearlastibits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();

        int i=(~0)<<x;

        System.out.println(n&i);
    }    
}
