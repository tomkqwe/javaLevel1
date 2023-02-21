package org.example.generics;


public class Pair<K, V> {
    private  K firstField;
    private  V secondField;

    public Pair(K firstField, V secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public K getFirstField() {
        return firstField;
    }

    public V getSecondField() {
        return secondField;
    }

    public void setFirstField(K firstField) {
        this.firstField = firstField;
    }

    public void setSecondField(V secondField) {
        this.secondField = secondField;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstField=" + firstField +
                ", secondField=" + secondField +
                '}';
    }
}
