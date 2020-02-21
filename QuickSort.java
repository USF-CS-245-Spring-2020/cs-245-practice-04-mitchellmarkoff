public class QuickSort implements SortingAlgorithm {
    public static void main(String [] args) {
        QuickSort t = new QuickSort();
        int a[] = {64, 34, 25, 12, 22, 11, 90}; 
        t.sort(a);
        int n = a.length; 
        // for (int i=0; i<n; ++i) 
        //     System.out.println(a[i] + " "); 
    }

    public void sort(int [] a) {
        qs(a,0,a.length-1);
    }

    public int partition(int [] arr, int low, int high) {
    int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) { 
            if (arr[j] < pivot) { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }

    void qs(int arr[], int low, int high) { 
        if (low < high) { 
            int pi = partition(arr, low, high); 
  
            qs(arr, low, pi-1); 
            qs(arr, pi+1, high); 
        } 
    }
}