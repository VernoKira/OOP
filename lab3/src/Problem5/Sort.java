package Problem5;

public class Sort {
  static <E> void swap(E [] array , int i, int j) {
    E swap = array[j];
    array[j] = array[i];
    array[i] = swap;
  }
  
  static <E extends Comparable<E>> void BubbleSort(E [] array) {
    int len = array.length;
    for(int i = 0; i < len - 1 ; i++) {
      for(int j = i + 1; j < len - 1; j++) {
        if(array[i].compareTo(array[j]) == -1) {
          swap(array, i, j);   
        }
      }
    }
  }

  static <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
    
      if(low < high) {
        int part = partition(array, low, high);
        quickSort(array, low, part - 1);
        quickSort(array, part + 1, high);
      }
    }
    
  private static <E extends Comparable<E>> int partition(E[] array, int low, int high) {
      int i = low - 1;
      
      for(int j = low; j < high; j++) {
        if(array[j].compareTo(array[high]) == 1) {
          i++;
          swap(array, i, j);
        }
      }
      swap(array, i + 1, high);
      return i + 1;
    }
}