package com.fibers.algorithm.datastructure;

/**
 * JD Interview
 */
interface MyLinkedList {
    public ItemObject find(int value);

    public void remove(int value);

    public void add(int value);

    public int size();
}

class ItemObject {
    int intValue;
    ItemObject next;

    public ItemObject(int _intValue) {
        intValue = _intValue;
    }

    public ItemObject getNext() {
        return next;
    }

    public void setNext(ItemObject _next) {
        next = _next;
    }


    public int getItemValue() {
        return intValue;
    }

    public boolean isEqual(int _intValue) {
        return (intValue == _intValue) ? true : false;
    }
}

public class LinkedList implements MyLinkedList {

    private ItemObject head;
    private ItemObject tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public ItemObject find(int value) {
        ItemObject p = head;
        while (p != null) {
            if (p.isEqual(value)) {
                return p;
            }
            p = p.getNext();
        }
        return null;
    }

    @Override
    public void remove(int value) {
        //该方法没说明是否移除多个值等于value的节点，默认全部移除。
        while (head != null && head.isEqual(value)) {
            head = head.getNext();
            size--;
        }

        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        ItemObject prev = head;
        ItemObject cur = head.getNext();

        while (cur != null) {
            if (cur.isEqual(value)) {
                prev.setNext(cur.getNext());
                size--;
            } else {
                prev = cur;
            }
            cur = cur.getNext();
        }
    }

    @Override
    public void add(int value) {
        if (size < Integer.MAX_VALUE) {
            size++;
            if (tail == null) {
                tail = new ItemObject(value);
                head = tail;
            } else {
                tail.setNext(new ItemObject(value));
                tail = tail.getNext();
            }
        }
        // size定义的是int，保证最大长度不溢出，个人建议这儿抛出异常会好一点，
        // 但由于MyLinkedList定义的该方法没有抛出异常的，所以这儿只能return.
        return;
    }

    @Override
    public int size() {
        return size;
    }
}
