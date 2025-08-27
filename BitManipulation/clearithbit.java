package BitManipulation;

import java.util.*;

public class clearithbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int x=sc.nextInt();

        int i=1<<x;

        int ans=n&(~i);

        System.out.println(ans);
    }
}
