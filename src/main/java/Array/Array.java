/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author sidhu
 */
public class Array {
    
    int arr[];
    int LB, UB;
    int size;

    public Array() {
        arr = new int[1];
        LB = 0;
        UB = -1;
        size = 1;
    }

    public Array(int size) {
        this.arr = new int[size];
        this.size = size;
        LB = 0;
        UB = -1;
    }
    
    public boolean isEmpty() {
        if(UB < LB) {
            System.out.println("Array Empty");
            return true;
        }
        return false;
    }

    public Array(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
    
    public void traverse() {
        if(isEmpty())
            return;
        System.out.print("\nArray : ");
        int i = LB;
        while(i <= UB) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
    
    public void insertAtEnd(int item) {   
        UB = UB + 1;
        arr[UB] = item;
    }

    public void deleteFromEnd() {
        if(isEmpty())
            return;
        UB--;
    }

    public void insertAtFront(int item) {
        if(UB + 1 == size) {
            System.out.println("Array is full!");
            return;
        }
        for(int i = UB; i >= LB; i--) {
            arr[i + 1] = arr[i];
        }
        arr[LB] = item;
        UB++;
    }
    
    public void deleteFromFront() {    
        if(isEmpty())
            return;
        for(int i=LB;i<UB;i++)
            arr[i]=arr[i+1];
        UB--;
    }

    public void insertAtPosition(int item, int position) {   
        if(position < 0 || position > UB + 1) {
            System.out.print("INVALID POSITION!! " + (UB + 1));
            return;
        }
        for(int i = UB; i >= position; i--) { 
            arr[i + 1] = arr[i];
        }
        arr[position] = item; 
        UB++; 
        System.out.println("\nInserted " + item + " at position " + position);
    }

    public void deleteAtPosition(int position) {
        if(isEmpty())
            return;
        if(position < 0 || position > UB + 1) {
            System.out.print("INVALID POSITION!! " + (UB + 1));
            return;
        }
        for(int i = position; i < UB; i++) {
            arr[i] = arr[i + 1];
        }
        UB--;
        
            
        System.out.println("\nDeleted at position " + position);
    }
    public int search(int element) {
        if (isEmpty()) {
            return -1; 
        }
        for (int i = LB; i <= UB; i++) {
            if (arr[i] == element) {
                System.out.println("Element " + element + " found at position: " + i); // Display the position
                return i; 
            }
        }
        System.out.println("Element " + element + " not found in the array."); // Display not found message
        return -1; 
    }
    public void countElements() {
        if (isEmpty())
            return ;
        int count = (UB - LB + 1);
        System.out.println("Count is:" + count);
    }
        
        public void selectionSort() {
        for (int i = LB; i < UB; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= UB; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
        public void BubbleSort() {
    
 
        for (int i = LB; i <= UB-1; i++) {
            for (int j = LB; j <= UB-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public void insertionSort(){
        for(int i = LB+1; i<=UB; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=LB && arr[j] > key){
                arr[j +1] = arr[j];
                j--;
            }
        arr[j + 1] = key;

        }
      
    }

    public void QuickSort()
    {
        quickSort(arr,LB,UB);
        
    }
    public void quickSort(int[] arr, int LB, int UB) {
        if (LB < UB) {
            int p = partition(arr, LB, UB);
            quickSort(arr, LB, p - 1);
            quickSort(arr, p + 1, UB);
        }
    }

    private int partition(int[] arr, int LB, int UB) {
        int pivot = arr[UB];  
        int i = LB - 1;  

        for (int j = LB; j < UB; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, UB);
        return i + 1;  
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    } 

    public void printDistinctElements()
    {
        int[] distinctArray = arr.clone();
        System.out.print("\nDistinct elements : ");
        int key;
        for(int i=LB; i<=UB ; i++){
            if (distinctArray[i] != -1){
                key = distinctArray[i];
                System.out.print(key+" ");
                for(int j = i + 1; j <=UB; j++ ){
                    if(distinctArray[j] == key){
                      distinctArray[j]= -1;
                    }
                }
            }
        }
    }
    
     public void printFrequencyTable()
    {
        int[] distinctArray = arr.clone();
        System.out.print("\n\tElement\t|\tFrequency");
        System.out.print("\n--------------------------------");
        int key,count;
        for(int i=LB; i<=UB ; i++){
            if (distinctArray[i] != -1){
                key = distinctArray[i];
                count=1;
                for(int j = i + 1; j <=UB; j++ ){
                    if(distinctArray[j] == key){
                      distinctArray[j]= -1;
                      count++;
                    }
                }
                System.out.print("\n\t"+key+"\t|\t"+count);
            }
        }
    }
    
    

        
    public int maxElement()
    {
        return maxElement(arr,LB,UB);
    }
    public int maxElement(int[] arr, int LB, int UB) {

        if (LB == UB) {
            return arr[LB];
        }
        if(LB < UB){
            int m = (LB + UB) / 2;
            int Lmax = maxElement(arr, LB, m);
            int Rmax = maxElement(arr, m + 1, UB);
            if(Lmax > Rmax){
                return Lmax;
            }
            else{
                return Rmax;
            }
        }
        return arr[LB];
    }
    public void mergeSort() {
        mergeSort(arr, LB , UB);
        
    }

    public void mergeSort(int[] arr, int LB, int UB) {
        if (LB < UB) {
            int mid = (LB + UB) / 2;
            mergeSort(arr, LB, mid);
            mergeSort(arr, mid + 1, UB);
            merge(arr, LB, mid, UB);
        }
    }

    private void merge(int[] arr, int LB, int mid, int UB) {
        int n1 = mid - LB + 1;
        int n2 = UB - mid;

        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        for (int i = 0; i < n1+1; i++) {
            left[i] = arr[LB + i];
        }
        
        
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        
        left[n1]=Integer.MAX_VALUE;
        right[n2]=Integer.MAX_VALUE;

        int i = 0, j = 0;
        for(int k=LB;k<=UB;k++){
            if(left[i]<right[j]){
                arr[k] = left[i++];
            }
            else{
                arr[k] = right[j++];
            }
        }
    } 
        
      public void heapSort() {
        
          int heap_size=UB;
          
  
        buildMaxHeap(heap_size);
        
     
        for (int i = heap_size; i > LB; i--)
        {

            swap(LB,i);
            heap_size--;
            Maxheapify(LB,heap_size);
            
        }
    }

    private void buildMaxHeap(int heap_size) {
      

    
        for (int i = (heap_size / 2) - 1; i >= LB; i--) {
            
 
      
            Maxheapify(i,heap_size);
           
        }
      
   
    }

    private void Maxheapify(int i, int heap_size) {
        
        int largest = i;
        int left =  2*i + 1;
        int right = 2*i + 2;
        
        if (left <= heap_size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= heap_size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            Maxheapify(largest,heap_size);
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    

    
    public Array getDistinctElements()
    {
        Array result=new Array(arr.length);
        int[] distinctArray = arr.clone();
        int key;
        for(int i=LB; i<=UB ; i++){
            if (distinctArray[i] != -1){
                key = distinctArray[i];
                result.insertAtEnd(key);
                for(int j = i + 1; j <=UB; j++ ){
                    if(distinctArray[j] == key){
                      distinctArray[j]= -1;
                    }
                }
            }
        }
        return result;
    }
}




    

