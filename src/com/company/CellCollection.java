package com.company;

public class CellCollection {

    Cell[] cells; //stores an array of cell objects
    int index = 0;  //holds the position of the next empty element

    public CellCollection(int size) {

        cells = new Cell[size]; //Creates an array of cell objects that has a size based on the given parameters

    }//end of constructor

    public void add(Cell c){

        cells[index]= c;
        index++;

    }//end of add method

    public Cell get(int i){

        return cells[i];

    }//end of get cells




}//end of CellsCollection class
