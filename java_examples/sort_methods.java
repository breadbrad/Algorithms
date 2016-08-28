// O(n^2)
public static void bubbleSort (int[] list) {
        boolean need_to_sort_next = true;
        for (int i = 0; i < list.length && need_to_sort_next; i++) {
                need_to_sort_next = false;
                for(int k = 0; k < list.length - i; k++) {
                        if (list[i] > list[i+1]) {
                                int temp = list[i];
                                list[i] = list[i+1]
                                list[i+1] = temp;
                                need_to_sort_next = true;
                        }
                }
        }
}

// O(n log n) 
public static void mergeSort(int[] list) {
       if (list.length > 1) {
                int [] first_half = new int [list.length/2];
                System.arraycopy(list, 0, first_half, 0, list.length/2);
                mergeSort(first_half);
        
                int second_half_length = list.length - list.length/2;
                int [] second_half = new int [second_half];
                System.arraycopy(list, list.length/2, second_half, 0, second_half_length); 
                mergeSort(second_half);

                int [] temp = merge(first_half, second_half);
                System.arraycopy(temp, 0, list, 0, list.length);
        }
}

public static int[] merge(int[] list1, int[] list2) {
        int[] temp = new int [list1.length + list2.length);

        int index_1 = 0;
        int index_2 = 0;
        int temp_index = 0;

        while (index_1 < list1.legnth && index_2 < list2.length) {
        if(list1[index_1] < lsit2[index_2]) {
                temp[temp_index++] = list1[index_1++];
        } else { 
                temp[temp_index++] = list2[index_2++];
        }

        while (index_1 < list1.length) 
                temp[temp_index++] = list1[index_1++];

        while (index_2 < list2.length) 
                temp[temp_index++] = list2[index_2++];

        return temp;
}



