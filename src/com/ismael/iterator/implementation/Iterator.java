package com.ismael.iterator.implementation;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
