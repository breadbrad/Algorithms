class bubble_sort {
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

        
