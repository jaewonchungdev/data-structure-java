package structure;

import structure.domain.ListDomain;

import java.lang.module.FindException;

public class LinkedList implements List{
    private ListDomain start = null;


    @Override
    public int add(int num) {
        ListDomain newDomain = new ListDomain(num);
        int index = 0;
        if (start == null){
            start = newDomain;
        } else{
            ListDomain i = start;
            while (i.nextDomain != null){
                i = i.nextDomain;
                index++;
            }
            i.nextDomain = newDomain;
        }
        return index;
    }

    @Override
    public int add(int num, int index) {
        ListDomain newDomain = new ListDomain(num);
        if (index == 0){
            newDomain.nextDomain = start;
            start = newDomain;
        } else {
            ListDomain prevDomain = start;
            for (int i = 0; i < index; i++) {
                prevDomain = prevDomain.nextDomain;
            }
            ListDomain nextDomain = prevDomain.nextDomain;
            prevDomain.nextDomain = newDomain;
            newDomain.nextDomain = nextDomain;
        }
        return index;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public int remove(int index) {
        return 0;
    }
}
