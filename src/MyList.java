import java.util.Arrays;

public class MyList<E>  {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;


    public MyList(){
         elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapacity() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E e){
        if (size >= elements.length) {
            ensureCapacity();
        }
        if (index>size||index<0) return;

        Object temp = elements[index];
        elements[index] = (Object) e;
        for (int i = index+1 ; i <= size; i++) {
            Object temp2 = elements[i];
            elements[i]=temp;
            temp=temp2;
        }
        size++;
    }
    public boolean add(E e){
        if (size >= elements.length) {
            ensureCapacity();
        }
        Object temp = (Object) e;
        elements[size] = temp;
        size++;
        return true;
    }
    public E remove(int index){
        if (index>=size||index<0){
            return null;
        }
        Object temp =  elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i]= elements[i+1];
        }
        size--;
        return (E)temp;
    }
    public int size() {
        return size;
    }
    public boolean contains(E e){
        Object temp = (Object) e;
        for (Object o : elements){
            if (o==temp) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
//        Object temp = (Object) e;
        for (int i = 0; i < size; i++) {
            if (elements[i]==e){
                return i;
            }
        }
        return -1;
    }
    public E get(int index){
        return (E) elements[index];
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp+= elements[i]+" ";
        }
        return temp ;
    }
}
