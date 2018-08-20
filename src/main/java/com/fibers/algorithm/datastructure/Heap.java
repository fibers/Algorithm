package com.fibers.algorithm.datastructure;

import com.fibers.utils.Utils;

public abstract class Heap {

    protected int[] h;
    protected int N;


    public Heap(int length) {
        h = new int[length + 1];
        N = 0;
    }

    abstract public void shift_up(int i);

    abstract public void shift_down(int i);

    abstract public void force_push(int v);

    public void push(int v) {
        if (N < h.length - 1) {
            N++;
            h[N] = v;
            this.shift_up(N);
        }
    }

    public int top() {
        if (N > 0) {
            return h[1];
        } else {
            return -1;
        }
    }

    public int bottom(){
        if (N > 0) {
            return h[N];
        } else {
            return -1;
        }
    }

    public int pop() {
        int v = -1;
        if (N > 0) {
            v = h[1];
            Utils.swap(h, 1, N);
            N--;
            this.shift_down(1);
        }
        return v;
    }

    public int[] heap_sort() {
        int[] a = new int[N];
        int i = 0;
        while (N > 0) {
            a[i] = this.pop();
            i++;
        }
        return a;
    }
}
