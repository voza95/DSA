public class Node<T> {
    T value;
    Node<T> leftNode;
    Node<T> rightNode;
    
    Node(T value) {
        this.value = value;
        this.leftNode = this.rightNode = null;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }
    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }
    
}