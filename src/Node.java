public class Node {
    public Node next;
    public Node previous;
    public String value;

    public Node(String value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next= next;

    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
