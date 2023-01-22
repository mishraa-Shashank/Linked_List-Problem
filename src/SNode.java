/**
 * @author Shashank
 */

/**
 * 1) declaring next node & its key as private variables
 * 2) Constructor
 * 3) getter & setter to get & set the value to the variables
 * @param <k>
 */
public class SNode<k> {
    private SNode next;
    private k key;

    public SNode(k key) {
        this.key = key;
        this.next = null;
    }

    public SNode getNext() {
        return next;
    }

    public k getKey() {
        return key;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
}

