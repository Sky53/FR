package reLern.collections;

import JavaRush.DATA.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_7 {
    public static void main(String[] args) {
        Data dataArrayListStart = new Data();
        List list = new ArrayList();
        insert10000(list);
        get10000(list);
        set10000(list);
        remove10000(list);
        Data dataArrayListStop = new Data();

        Data dataLinkedListStart = new Data();
        List list1 = new LinkedList();
        insert10000(list1);
        get10000(list1);
        set10000(list1);
        remove10000(list1);
        Data dataLinkedListStop = new Data();




    }
    public static void insert10000(List list) {
        for ( int i = 0; i < 10_000; i++){
            list.add(i);
        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < 10_000; i++){
            list.get(i);
        }

    }

    public static void set10000(List list) {
        for (int i = 0; i < 10_000; i++){
            list.set(i,i);
        }

    }

    public static void remove10000(List list) {
        for (int i = list.size() - 1; i >= 0; i--){
            list.remove(i);
        }

    }
}
