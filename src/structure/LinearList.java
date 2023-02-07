package structure;

import java.util.Arrays;

public class LinearList implements List {
    private final Integer[] list;
    private final int size;
    private int pointer = 0;

    public LinearList(int size) {
        this.size = size;
        this.list = new Integer[size];
    }

    @Override
    public int add(int num) {
        if (pointer >= size) {
            throw new IndexOutOfBoundsException();
        }
        list[pointer++] = num;
        return pointer;
    }


    @Override
    public int add(int num, int index) {
        if (pointer >= size || index > pointer) {
            throw new IndexOutOfBoundsException();
        }

        Integer temp = null;
        pointer++;
        for (int i = index; i < pointer; i++) {
            Integer curVal = list[i];
            list[i] = temp;
            temp = curVal;
        }
        list[index] = num;

        return index;
    }

    @Override
    public int get(int index) {
        if (index > pointer || pointer <= 0) {
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }


    @Override
    public int remove() {
        if (pointer <= 0) {
            throw new NullPointerException();
        }
        int resp = list[--pointer];
        list[pointer] = null;
        return resp;
    }


    @Override
    public int remove(int index) {
        if (index > pointer || pointer <= 0) {
            throw new IndexOutOfBoundsException();
        }
        int resp = list[index];

        pointer--;
        Integer temp = null;
        for (int i = pointer; i >= index; i--) {
            int prev = list[i];
            list[i] = temp;
            if (i == 0) {
                continue;
            }
            temp = prev;
        }
        return resp;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
