package ru.alexander_kramarenko.array_list;

public class MyArrayList<T extends Comparable<T>> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <=0 " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Comparable[capacity];
    }

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Comparable[capacity];
    }

    public void add(T item) {
        list[size] = item;
        size++;
        int temp_capacity = DEFAULT_CAPACITY;
        if (size >= Math.round(0.75 * capacity)) {
            temp_capacity = capacity + (int) Math.round(0.5 * capacity);

            T[] temp_list = (T[]) new Comparable[temp_capacity];

            for (int i = 0; i < list.length; i++) {
                temp_list[i] = list[i];
            }
            list = temp_list;
            capacity = temp_capacity;
        }
    }

    public void add(int index, T item) {
        System.out.println("Index = " + index);
        System.out.println("list.length = " + list.length);
        System.out.println("list.size" + size());

        if (index < 0 || index > list.length - 1) {
            throw new MyIndexOutOfBoundsException(index, list.length);
        }

        if (index >= size + 1) {
            index = size;
        }
        System.out.println("Index = " + index);
        System.out.println("Item = " + item);

        int temp_capacity = DEFAULT_CAPACITY;
        if (size >= Math.round(0.75 * capacity)) {

            System.out.println("Расширяемся");
            temp_capacity = capacity + (int) Math.round(0.5 * capacity);

            T[] temp_list = (T[]) new Comparable[temp_capacity];

            for (int i = 0; i < list.length; i++) {
                temp_list[i] = list[i];
            }
            list = temp_list;
            capacity = temp_capacity;
        }

        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }

        list[index] = item;
        size++;
        System.out.println("size = " + size);
    }

    public final T remove(int index) {
        if (index < 0 || index > list.length - 1) {
            throw new MyIndexOutOfBoundsException(index, list.length);
        }

        T temp = list[index];
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null;
        return temp;
    }

    public boolean remove(T item) {
        int i = indexOf(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {

        if (index < 0 || index > list.length - 1) {
            throw new MyIndexOutOfBoundsException(index, list.length);
        }

        return list[index];
    }

    public void set(int index, T item) {

        if (index < 0 || index > list.length - 1) {
            throw new MyIndexOutOfBoundsException(index, list.length);
        }

        list[index] = item;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]).append(", ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }

        sb.append(" ]");
        return sb.toString();
    }


}
