package Sorting;

import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        mergeSort(a,0,a.length-1);

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        System.out.println();
    }

    private static void mergeSort(int[] a,int l,int h){
        if(l<h){
            int m=l+(h-l)/2;

            mergeSort(a, l, m);
            mergeSort(a, m+1, h);
            
            merger(a,l,m,h);
        }
    }

    private static void merger(int[] a,int l,int m,int h){
        int[] n=new int[h-l+1];
        int i=l,j=m+1;

        int k=0;

        while(i<=m && j<=h){
            if(a[i]<a[j]){
                n[k]=a[i];
                i++;
                k++;
            }else{
                n[k]=a[j];
                j++;
                k++;
            }
        }

        while(i<=m){
            n[k]=a[i];
            i++;
            k++;
        }

        while(j<=h){
            n[k]=a[j];
            j++;
            k++;
        }

        for(k=0,i=l;k<n.length;k++,i++){
            a[i]=n[k];
        }
    }
}
