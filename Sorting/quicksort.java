package Sorting;

import java.util.*;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        
        quickSort(a,0,a.length-1);

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");

        System.out.println();
    }

    private static void quickSort(int[] a,int l,int h){
        if(l<h){
            int pivot=partition(a,l,h);
            
            quickSort(a, l, pivot-1);

            quickSort(a,pivot+1,h);
        }
    }

    private static int partition(int[] a,int l,int h){
        int pivot=a[h];

        int i=l-1;

        for(int j=l;j<h;j++){
            if(a[j]<pivot){
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i+1,h);

        return i+1;
    }

    private static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
