/**
 * @author Shashak
 */
public class MyLinkedList {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List program");
        SNode<Integer> myFirstNode = new SNode<>(56);
        SNode<Integer> mySecondNode = new SNode<>(30);
        SNode<Integer> myThirdNode = new SNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        System.out.println(myFirstNode.getKey()+"->"+mySecondNode.getKey()+"->"+myThirdNode.getKey());
    }
}
