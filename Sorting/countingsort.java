package Sorting;

import java.util.*;

public class countingsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        int[] cs=new int[max+1];

        for(int i=0;i<n;i++){
            cs[a[i]]++;
        }

        int j=0;
        for(int i=0;i<cs.length;i++){
            while (cs[i]>0){
                a[j]=i;
                j++;
                cs[i]--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }    
}