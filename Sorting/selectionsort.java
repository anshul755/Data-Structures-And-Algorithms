package Sorting;

import java.util.*;

public class selectionsort {

    public static void swap(int i,int j,int[] a){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=0;i<n-1;i++){
            int mp=i;
            for(int j=i+1;j<n;j++){
                if(a[mp]>a[j]){
                    mp=j;
                }
            }
            swap(i,mp,a);
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }    
}
