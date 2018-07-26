package com.fibers.algorithm.datastructure;

/** Min Heap **/
public class MinHeap {
    private int[] h;
    private int size;


    public MinHeap(int length) {
        h = new int[length];
        size = 0;
    }

    public void shift_up(int i) {
        if( i >= 0 && i < h.length ){
            int parentIndex = (i - 1) / 2;
            if(parentIndex > 0 && this.h[parentIndex] > this.h[i]){
                int temp = this.h[parentIndex];
                this.h[parentIndex] = this.h[i];
                this.h[i] = temp;
            }
        }
        return;
    }

    public void shift_down(int i) {
        if( i >= 0 && i < h.length ){
            int parentIndex = (i - 1) / 2;
            if(parentIndex > 0 && this.h[parentIndex] > this.h[i]){
                int temp = this.h[parentIndex];
                this.h[parentIndex] = this.h[i];
                this.h[i] = temp;
            }
        }
        return;
    }


    public void push(int v) {

    }

    public void top() {

    }

    public void pop() {

    }

    public void heap_sort() {

    }


}
