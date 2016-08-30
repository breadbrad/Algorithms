/** if the keys are small integers, bucket sort can be used without having to compare the keys =>  O(n + N) time to sort & O(n + N) space (n = list size) , N is too larget, bucketsort is not desirable  */
// each bucket holds the elemnts with the same key value 
void bucketSort(E[] list) {
        E[] buckets = (E[]) new java.util.ArrayList[N];

        // Distribute the elements fomr list to buckets 
        for (int i = 0; i < list.length; i++) {
                int key = list[i].getKey();

                if (buckets[key] == null)
                        buckets[key] = new java.util.ArrayList();

                buckets[key].add(list[i]);
        }
       
        // Now move the elements form the buckets back to list 
        int k = 0; // k is an index for list 
        for (int i = 0; i < buckets.length; i++) {
                if(buckets[i] != null) {
                        for (int j = 0; j < buckets[i].size(); j++)
                                list[k++] = buckets[i].get(j);
                }
        }
}

