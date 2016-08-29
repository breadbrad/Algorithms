// Heapsort is more space efficient than merge sort 
class HeapSort {
        public static <E extends Comparable<E>> void heapSort(E[] list) {
                Heap<E> heap = new Heap <E>();

                for (E nextItem : list) 
                        heap.add(nextItem);

                for(int i = list.length - 1; i >= 0; i--) 
                        list[i] = heap.remove();
       }

       public static void main(String[] args) {
                Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12}; 
                heapSort(list);
                for(Integer element : list) 
                        System.out.print(element + " ");
        }
}


