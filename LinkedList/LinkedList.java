import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int item) {
            this.value = item;
        }

    }

    private Node first;
    private Node last;
    private int size = 0;

    private boolean empty() {
        return first == null;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (empty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;

    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (empty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;

    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contain(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeFirst() {
        if (empty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var saved = first.next;
            first.next = null;
            first = saved;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current.next != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeLast() {
        if (empty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if(empty()) return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;

    }

}
