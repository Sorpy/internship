package com.internship;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListDuplicateRemover {
    public ArrayList<String> createList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("there");
        list.add("general");
        list.add("Kenobi");
        list.add("general");
        return list;
    }
    public void removeDuplicates(ArrayList<String> list){
        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }

    public void removeDupCycle(ArrayList<String> list){
        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
