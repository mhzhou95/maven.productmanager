package com.github.curriculeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    List<SomeType> Items = new ArrayList<>();

    @Override
    public void add(SomeType someObject) {
        Items.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return Items.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return Items.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return Items.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return objectsToBeAdded;
    }
}
