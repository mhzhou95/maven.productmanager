package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {
    List<SomeType> list = new ArrayList<>();

    @Override
    public void add(SomeType someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return list.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return list.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        SomeType result = list.get(indexOfElement);
        list.remove(indexOfElement);
        return result;
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return list.toArray(objectsToBeAdded);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return list.iterator();
    }
}
