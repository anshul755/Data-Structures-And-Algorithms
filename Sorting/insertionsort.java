package Sorting;

import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=1;i<n;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
