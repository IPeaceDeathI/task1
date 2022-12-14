package Prac_32;

import java.io.Serializable;

public class ListElement implements Serializable {
    MenuItem item;
    ListElement prevItem;
    ListElement nextItem;
    ListElement(MenuItem item, ListElement parent){
        this.item = item;
        this.prevItem = parent;
    }
}
