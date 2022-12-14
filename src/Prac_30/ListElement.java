package Prac_30;

public class ListElement {
    MenuItem item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(MenuItem item, ListElement parent){
        this.item = item;
        this.prevItem = parent;
    }
}

