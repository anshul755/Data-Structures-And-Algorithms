package BitManipulation;

import java.util.*;

public class clearrangeofbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ans=((~0)<<(b+1)) | ((1<<a)-1);

        System.out.println(n&ans);
    }    
}
