package com.fibers.algorithm.datastructure;

import com.fibers.utils.Utils;

public class MinHeap extends Heap {

    public MinHeap(int length) {
        super(length);
    }


    public static void main(String[] args) {

        MinHeap mh = new MinHeap(10);

        int[] nums = new int[]{3, 1, 4, 6, 7, 10, 2, 5, 9, 8};
        for (int i : nums) {
            mh.push(i);
        }

        Utils.printArray(mh.heap_sort());
    }

    @Override
    public void shift_up(int i) {
        while (i > 1 && h[i] < h[i / 2]) {
            Utils.swap(h, i, i / 2);
            i = i / 2;
        }
    }

    @Override
    public void shift_down(int i) {
        while (2 * i <= N) {
            int j = 2 * i;
            if (j < N && h[j] > h[j + 1]) {
                j += 1;
            }
            if (h[i] < h[j]) {
                break;
            }
            Utils.swap(h, i, j);
            i = j;
        }
    }

    @Override
    public void force_push(int v) {
        if (N < h.length - 1) {
            this.push(v);
        } else {
            if (v > h[1]) {
                h[1] = v;
                this.shift_down(1);
            }
        }
    }
}
