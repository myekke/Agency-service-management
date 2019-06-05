
class Heap {

    private int[] heap = new int[1];
    private int last;
    private int asize = heap.length;
    private int heapSize;


    int getMax() {
        return heap[0];
    }

    void delete() {
        last = heapSize - 1;
        heap[0] = heap[last];
        last = 0;
        heapSize--;
        downheap(heap, 0, heapSize);
    }

    void insert(int k) {

        int[] temp;
        if (heapSize == asize) {
            temp = new int[asize * 2];
            System.arraycopy(heap, 0, temp, 0, heapSize);
            heap = temp;
        }
        last = heapSize;
        heap[last] = k;
        heapSize++;
        upheap(heap, last);


    }




    private void downheap(int[] h, int i, int size) {
        int leftChild = (2 * i) + 1;
        int rightChild = (2 * i) + 2;
        int temp;
        if (i >= size) {
            return;
        }
        temp = h[i];
        if (hasTwoChildren(i)) {
            if (h[i] < h[leftChild] || h[i] < h[rightChild]) {
                if (h[leftChild] > h[rightChild]) {
                    h[i] = h[leftChild];
                    h[leftChild] = temp;
                    downheap(h, leftChild, size);
                } else if (h[leftChild] < h[rightChild]) {
                    h[i] = h[rightChild];
                    h[rightChild] = temp;
                    downheap(h, rightChild, size);
                }
            }

        }
        if (hasOneChild(i)) {
            if (h[leftChild] > h[i]) {
                h[i] = h[leftChild];
                h[leftChild] = temp;
            }
        }
    }

    private boolean hasOneChild(int i) {
        return (((2 * i) + 1) < heapSize && (2 * i) + 2 >= heapSize);

    }

    private boolean hasTwoChildren(int i) {
        return (((2 * i) + 1) < heapSize && (2 * i) + 2 < heapSize);
    }

    private void upheap(int[] h, int i) {
        int parent = (i - 1) / 2;
        int temp;
        if (i < 0) {
            return;
        }
        temp = h[parent];
        if (h[i] > h[parent]) {
            h[parent] = h[i];
            h[i] = temp;
            upheap(h, parent);
        }
    }
}
