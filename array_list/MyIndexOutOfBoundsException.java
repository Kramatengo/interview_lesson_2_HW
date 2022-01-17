package ru.alexander_kramarenko.array_list;

public class MyIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException {

    int indexEx;
    int arraySizeEx;

    public MyIndexOutOfBoundsException(int indexEx, int arraySizeEx) {
        this.indexEx = indexEx;
        this.arraySizeEx = arraySizeEx;
        System.out.println("Почему index = " + indexEx + ". Должен быть от 0 до " + (arraySizeEx - 1));
    }

}