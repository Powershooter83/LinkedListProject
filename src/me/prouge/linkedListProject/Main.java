package me.prouge.linkedListProject;

import me.prouge.linkedListProject.enums.SortOder;
import me.prouge.linkedListProject.modals.NumberMemory;

public class Main {

    public static void main(String[] args){

        NumberMemory<Long> numberMemory = new NumberMemory<>();
        numberMemory.add(20000000000L);
        numberMemory.add(2000000000L);
        numberMemory.add(300000000000L);
        numberMemory.get(SortOder.ASCENDING);
    }

}
