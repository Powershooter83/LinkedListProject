package me.prouge.linkedListProject;

public interface INumberMemory<T extends Number>  {

    void add(T n);

    boolean contains(T n);

    void get(SortOder sortOder);

    void clear();

}
