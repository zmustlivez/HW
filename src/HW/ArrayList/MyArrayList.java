package HW.ArrayList;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private T[] tempArray;


    public MyArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        } else {
            array = (T[]) new Object[capacity];
        }
    }

    private int increaseCapacity() {
        return (int) (this.array.length * 1.5 + 1);
    }

    private boolean rightIndex(int index) {
        return this.array.length > index;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return this.indexOf(o) > 0 ? true : false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(T o) {
        if (this.size == this.array.length) {
            tempArray = (T[]) new Object[this.increaseCapacity()];
            System.arraycopy(this.array, 0, tempArray, 0, this.array.length);
            this.array = tempArray;

        }
        this.array[this.size++] = o;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = this.indexOf(o);
        if (index >= 0) {
            if (index < this.size - 1) {
                System.arraycopy(this.array, index + 1, this.array, index, this.size - 1);
            }
            this.array[this.size - 1] = null;
            this.size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.array[i] = null;
        }
    }

    @Override
    public T get(int index) {
        return this.array[index];
    }

    @Override
    public T set(int index, T element) {
        return this.array[index] = element;
    }

    @Override
    public void add(int index, T element) {
        if (this.rightIndex(index)) {
            this.array[index] = element;
        }
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    private class Iter implements ListIterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public T previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }
    }

    @Override
    public List subList(int fromIndex, int toIndex) {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public <T> T[] toArray(T[] a) {
//        Class<?> clazz =a.getClass().getComponentType();
        T[] tempArray = (T[]) Arrays.copyOf(a, a.length, a.getClass());
//        System.arraycopy(a, 0, array, 0, a.length);
        return tempArray;
    }
}
