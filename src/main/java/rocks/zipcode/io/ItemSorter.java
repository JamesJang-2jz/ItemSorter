package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    Item[] itemArray;

    public ItemSorter(Item[] items) {
        itemArray = items;
    }
    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(itemArray, comparator); // sort. first parameter is array to sort, second is parameter to sort by
        System.out.println(Arrays.toString(itemArray));
        return itemArray;
    }
}
