package me.prouge.linkedListProject;

public class Element<T> {

    private Element<T> nextElem;
    private final Element<T> previousElem;
    private final T number;

    public Element(Element<T> nextElem, Element<T> previousElem, T number) {
        this.nextElem = nextElem;
        this.previousElem = previousElem;
        this.number = number;
    }


    public Element<T> getNextElem() {
        return this.nextElem;
    }

    public void setNextElem(Element<T> nextElem) {
        this.nextElem = nextElem;
    }
    public T getNumber(){
        return this.number;
    }

}
