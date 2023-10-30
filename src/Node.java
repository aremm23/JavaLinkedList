public class Node<T> {
    private T value;
    private Node prev;
    private Node next;
    Node(T value) {
        this.value = value;
    }
    Node() {}
    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }
}
