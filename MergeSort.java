// Abstracted from Geeks for Geeks merge sort. Was having issues getting merge sort we wrote in class to work properly.

import java.io.*;

public class MergeSort implements SortingAlgorithm {
    public static void main (String [] args) {
        MergeSort t = new MergeSort();
        int a[] = {64, 34, 25, 12, 22, 11, 90}; 
        t.sort(a);
        int n = a.length; 
        // for (int i=0; i<n; ++i) 
        //     System.out.println(a[i] + " "); 

    }
    public void sort(int [] a) {
        split(a, 0, a.length-1);
    }

   public void merge(int a[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = a[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = a[m + 1+ j]; 
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                a[k] = L[i]; 
                i++; 
            } 
            else { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) { 
            a[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    
    public void split(int a[], int l, int r) { 
        if (l < r) { 
           int m = (l+r)/2; 
  
            // Sort first and second halves 
            split(a, l, m); 
            split(a , m+1, r); 
  
            // Merge the sorted halves 
            merge(a, l, m, r); 
        } 
    } 

}