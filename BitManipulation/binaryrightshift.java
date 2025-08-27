package BitManipulation;

import java.util.Scanner;

public class binaryrightshift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=a>>2; // (a/2^b)

        System.out.println(ans);
    }
}
