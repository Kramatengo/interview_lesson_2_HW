package ru.alexander_kramarenko.linked_list;

import java.util.ListIterator;

public class MainLinkedList {


    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("one");
        mll.insertFirst("two");
        mll.insertFirst("three");
        mll.insertFirst("four");
        mll.insertFirst("five");
        mll.insertFirst("six");

        mll.insertLast("eight");
        System.out.println("mll.insertLast(\"eight\");  = " + mll);


        mll.insert(1, "index_1");
        System.out.println("mll.insert(1, \"index_1\"); = " + mll);
        mll.remove("one");
        System.out.println("mll.remove(\"one\"); = " + mll);

        for (String s : mll) {
            System.out.println("s = " + s);
        }

        ListIterator<String> li = mll.listiterator();
        String temp = li.next();
        li.remove();
        temp = li.next();
        li.remove();
        temp = li.next();
        li.remove();

        while (li.hasNext()) {
            System.out.println("li.next() = " + li.next());
        }

        System.out.println("mll.size() = " + mll.size());

        System.out.println("mll.getFirst() = " + mll.getFirst());
        ListIterator<String> li1 = mll.listiterator();
        li1.next();
        li1.add("li1.add");

        while (li1.hasNext()) {
            System.out.println("li.next() = " + li1.next());
        }
    }
}

