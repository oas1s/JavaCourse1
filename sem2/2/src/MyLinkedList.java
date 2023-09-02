public class MyLinkedList<T> {
    private Node<T> firstNode;

    public int size(){
        int size =0;
        Node<T> currentNode = firstNode;
        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            size++;
        }
        int size2 = 0;
        for (Node<T> i = firstNode; i.getNext() != null ; i = i.getNext()) {
            size2++;
        }
        return size;
    }

    public boolean add(T elem){
        Node<T> lastNode = firstNode;
        for (Node<T> i = firstNode; i.getNext() != null ; i = i.getNext()) {
            lastNode = i;
        }
        Node<T> newNode = new Node<>();
        newNode.setValue(elem);
        lastNode.setNext(newNode);
        return true;
    }
}
