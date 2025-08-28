//Optimized Code with if the array sort in between

package Sorting;
import java.util.*;
public class bubblesort {

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

        boolean f=false;

        for(int i=0;i<n;i++){
            f=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(j,j+1,a);
                    f=true;
                }
            }
            if(!f){
                break;
            }
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}




// Code with less no. times the inner loop running

// package Sorting;
// import java.util.*;
// public class bubblesort {

//     public static void swap(int i,int j,int[] a){
//         int temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++) a[i]=sc.nextInt();

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(a[j]>a[j+1]){
//                     swap(j,j+1,a);
//                 }
//             }
//         }
//         for(int i=0;i<n;i++) System.out.print(a[i]+" ");
//     }
// }
