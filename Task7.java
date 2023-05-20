package aspire.internship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task7 {
    private int arraySize;
    private List<LinkedList<Pair>> array;

    public Task7(int size) {
        arraySize = size;
        array = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            array.add(new LinkedList<>());
        }
    }

    public void put(Object key, Object value) {
        int position = key.hashCode() % arraySize;
        LinkedList<Pair> list = array.get(position);

        for (Pair pair : list) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }

        list.add(new Pair(key, value));
    }

    public Object get(Object key) {
        int position = key.hashCode() % arraySize;
        LinkedList<Pair> list = array.get(position);

        for (Pair pair : list) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

    private class Pair {
        private Object key;
        private Object value;

        public Pair(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Task7 myMap = new Task7(100);

        myMap.put("key1", "value1");
        myMap.put("key2", "value2");
        myMap.put("key3", "value3");
        myMap.put("key3", "value4");

        System.out.println(myMap.get("key1"));  // Output: value1
        System.out.println(myMap.get("key2"));  // Output: value2
        System.out.println(myMap.get("key3"));  // Output: value4
        System.out.println(myMap.get("key4"));  // Output: null
    }
}