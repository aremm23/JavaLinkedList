public class MyList<T> {
    private Node node;
    private Node begin;
    private Node end;
    private boolean isSorted;
    {
        node = null;
        begin = null;
        end = null;
        isSorted = false;
    }
    public MyList() {}
    public void add(T value) {
        this.node = new Node<>(value);
        node.setValue(value);
        if(begin == null) {
            begin = node;
        }
        else
            end.setNext(node);
        node.setPrev(end);
        end = node;
    }

    public void print() {
        Node pointer = begin;
        while (pointer != null){
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
    }

    public boolean deleteElement(T value) {
        boolean isDeleted = false;
        Node pointer = begin;
        while(pointer != null) {
            if(pointer.getValue() == value){
                if(pointer.equals(begin))
                    begin = pointer.getNext();
                else
                    pointer.getPrev().setNext(pointer.getNext());
                if(pointer.equals(end))
                    end = pointer.getPrev();
                else
                    pointer.getNext().setPrev(pointer.getPrev());
                isDeleted = true;
            }
            pointer = pointer.getNext();
        }
        return isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder("{");
        Node pointer = begin;
        while (pointer != null) {
            toString.append(", " + pointer.getValue());
            pointer = pointer.getNext();
        }
        toString.append("}");
        return toString.toString();
    }
}
