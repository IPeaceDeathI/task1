package Prac_21;

public class ManyElementsArray<E>{
    private E[] array;
    public E get(int index){
        return array[index];
    }
    public void setArray(E[] array){
        this.array = array;
    }
}
