package me.prouge.linkedListProject;

public class Main {

    public static void main(String[] args){

        NumberMemory<Byte> numberMemory = new NumberMemory<>();
        numberMemory.add((byte) 2);
        numberMemory.add((byte) 3);
        numberMemory.add((byte) 33);
        numberMemory.add((byte) 12);

        numberMemory.get(SortOder.DESCENDING);
    }

}
