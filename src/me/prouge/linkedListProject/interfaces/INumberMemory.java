package me.prouge.linkedListProject.interfaces;

import me.prouge.linkedListProject.enums.SortOder;

public interface INumberMemory<T extends Number>  {

    void add(T n);

    boolean contains(T n);

    void get(SortOder sortOder);

    void clear();

}
