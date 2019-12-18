package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item> {
    List<Item> Items = new ArrayList<>();

    @Override
    public void add(Item someObject) {
        Items.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        return Items.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return Items.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return Items.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return objectsToBeAdded;
    }
}
