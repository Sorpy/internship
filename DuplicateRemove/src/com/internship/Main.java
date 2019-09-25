package com.internship;

public class Main {

    public static void main(String[] args) {
        ListDuplicateRemover remover = new ListDuplicateRemover();
        remover.removeDuplicates(remover.createList());
        remover.removeDupCycle(remover.createList());
    }
}
