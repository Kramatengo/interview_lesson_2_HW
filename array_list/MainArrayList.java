package ru.alexander_kramarenko.array_list;

import java.util.Random;

public class MainArrayList {

    public static void main(String[] args) {

        MyArrayList<Integer> mal = new MyArrayList<>(10);
        mal.add(1);
        mal.add(2);
        mal.add(3);
        mal.add(4);
        mal.add(5);
        mal.add(6);

        System.out.println(mal);

        mal.add(2, 99);
        mal.add(2, 77);
        mal.add(2, 88);
        System.out.println(mal);

        System.out.println(mal.remove(2));
        System.out.println(mal);

        System.out.println("get = " + mal.get(1));

    }

}
