public class DoubleList {
    private  Node first;
    private  Node last;
    private int size;

    public DoubleList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public void add(String value){
        Node newNode = new Node(value);
         if(first == null){
             first= newNode;
             last= newNode;
         }else{
             last.setNext(newNode);
             newNode.setPrevious(last);
             last = newNode;
         }
        size++;

    }
    public int count() {
        return size;
    }
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }
    public boolean contains(String value) {
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public void remove(String value) {
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(value)) {
                if (current == first) {
                    first = current.getNext();
                    if (first != null) first.setPrevious(null);
                } else if (current == last) {
                    last = current.getPrevious();
                    if (last != null) last.setNext(null);
                } else {
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                }
                size--;
                return;
            }
            current = current.getNext();
        }
    }
    public void removeAt(int index) {
        if (index < 0 || index >= size) return;
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        remove(current.getValue());
    }
    public void replace(String oldValue, String newValue) {
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(oldValue)) {
                current.setValue(newValue);
                return;
            }
            current = current.getNext();
        }
    }
    public void concatenate(DoubleList otherList) {
        if (otherList.first == null) return;
        if (this.first == null) {
            this.first = otherList.first;
            this.last = otherList.last;
        } else {
            this.last.setNext(otherList.first);
            otherList.first.setPrevious(this.last);
            this.last = otherList.last;
        }
        this.size += otherList.size;
    }
    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.getValue() + " <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}


