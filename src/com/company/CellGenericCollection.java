package com.company;

public class CellGenericCollection<T> {

    T[] cells;
    int i = 0;

    public CellGenericCollection(int size) {

        cells = new T[size];

    }

    public void add(T c){

        cells[i] = c;
        i++;

    }//end add

    public T get(int i){

        return cells[i];

    }
}
