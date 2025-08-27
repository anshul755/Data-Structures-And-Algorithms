package BitManipulation;

import java.util.*;

public class oddevenbinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if((1&n)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }    
}
