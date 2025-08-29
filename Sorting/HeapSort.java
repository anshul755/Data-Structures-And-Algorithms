package Sortings;

import java.util.*;

public class HeapSort{
    private static int[] generateRandomArray(int size){
        Random rand=new java.util.Random();
        
        int[] arr=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=rand.nextInt(1000);
        }
        
        return arr;
    }

    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        
        if(left<n && arr[left]>arr[largest]) largest=left;

        if(right<n && arr[right]>arr[largest]) largest=right;
        
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }

    private static void heapSort(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--) heapify(arr,n,i);
        for(int i=n-1;i>=0;i--){
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=generateRandomArray(sc.nextInt());
        System.out.println(Arrays.toString(a));
        
        long sT=System.nanoTime();
        heapSort(a);
        long eT=System.nanoTime();
        
        long dur=eT-sT;
        
        System.out.println();
        System.out.println("Total Duration(in micro): "+dur/1000);
        System.err.println();

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(a));
    }
}
