import java.io.*;

public class InsertionSort implements SortingAlgorithm{
    
    public void sort(int [] a) { 
        int n = a.length; 
        for (int i = 1; i < n; ++i) { 
            int temp = a[i]; 
            int j = i - 1; 
  
            while (j >= 0 && a[j] > temp) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = temp; 
        } 
    }

    public static void main(String [] args) {

        InsertionSort t = new InsertionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        t.sort(arr);
        int n = arr.length; 
        // for (int i=0; i<n; ++i) 
        //     System.out.println(arr[i] + " "); 

    }
}