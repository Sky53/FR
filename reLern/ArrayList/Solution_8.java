package reLern.ArrayList;

import java.util.ArrayList;

public class Solution_8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean r = list.get(i).contains("р");
            boolean l = list.get(i).contains("л");
            if ( r && !l) {
                list.remove(i);
                i--;// уменьшение списка, соответвенно индкс - 1
            }
            if (l && !r) {
                list.add(i,list.get(i));
                i++;// увелечение списка соответсвенно инжекс +1
            }
        }
        return list;
    }
}
