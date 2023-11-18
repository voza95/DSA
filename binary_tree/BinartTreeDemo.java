import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class BinartTreeDemo {
    
    public static void main(String[] args) {
        Node<String> a = new Node<String>("A");
        Node<String> b = new Node<String>("B");
        Node<String> c = new Node<String>("C");
        Node<String> d = new Node<String>("D");
        Node<String> e = new Node<String>("E");
        Node<String> f = new Node<String>("F");

        // Node<Integer> a = new Node<Integer>(3);
        // Node<Integer> b = new Node<Integer>(2);
        // Node<Integer> c = new Node<Integer>(7);
        // Node<Integer> d = new Node<Integer>(4);
        // Node<Integer> e = new Node<Integer>(-2);
        // Node<Integer> f = new Node<Integer>(5);

        a.setLeftNode(b);
        a.setRightNode(c);
        b.setLeftNode(d);
        b.setRightNode(e);
        c.setRightNode(f);
 
        //deepthFirstValueIterative(a);
        // preOrderdeepthFirstValueRecursive(a);
        // postOrderDeepthFirstValueRecursive(a);
        // inOrderDeepthFirstValueRecursive(a);
        // breadthFirstValueIterative(a);
        System.out.println(breathFirstSearchValue(a, "G"));
    }


    static boolean breathFirstSearchValue(Node<String> root, String searchedValue) {
        if (root == null) return false;
        if (root.value.equalsIgnoreCase(searchedValue)) return true;
        Queue<Node> nodeList = new LinkedList<>();
        nodeList.add(root);
        while (nodeList.size() > 0) {
            Node<String> currentNode = nodeList.remove();
            if (currentNode.value.equalsIgnoreCase(searchedValue)) {
                return true;
            }
            if (currentNode.leftNode != null) nodeList.add(currentNode.leftNode);
            if (currentNode.rightNode != null) nodeList.add(currentNode.rightNode);
        }
        return false;
    }


    static void breadthFirstValueIterative(Node<String> root) {
        if (root == null) return;
        Queue<Node> nodeList = new LinkedList();
        nodeList.add(root);
        while(nodeList.size() > 0) {
            Node<String> currentNode = nodeList.remove();
            System.out.println(currentNode.value);
            if (currentNode.leftNode != null) nodeList.add(currentNode.leftNode);
            if (currentNode.rightNode != null) nodeList.add(currentNode.rightNode);
        }
    }

    // Pre-Order traversal
    static void preOrderdeepthFirstValueRecursive(Node<String> root) {
        if (root == null) return;
        System.out.println(root.value);
        preOrderdeepthFirstValueRecursive(root.leftNode);// [b,d,e]
        preOrderdeepthFirstValueRecursive(root.rightNode);// [c,f]
    } // O(n) - time; O(n) - space

    static void postOrderDeepthFirstValueRecursive(Node<String> root) {
        if (root == null) return;
        postOrderDeepthFirstValueRecursive(root.leftNode);
        postOrderDeepthFirstValueRecursive(root.rightNode);
        System.out.println(root.value);
    }

    static void inOrderDeepthFirstValueRecursive(Node<String> root) {
        if (root == null) return;
        postOrderDeepthFirstValueRecursive(root.leftNode);
        System.out.println(root.value);
        postOrderDeepthFirstValueRecursive(root.rightNode);
    }

    static void deepthFirstValueIterative(Node<String> root) {
        if (root == null) return;
        Stack<Node> myStack = new Stack<>();
        myStack.push(root);
        
        while (!myStack.isEmpty()) {
            Node<String> currentNode = myStack.pop();
            System.out.println(currentNode.value);

            if (currentNode.rightNode != null) myStack.push(currentNode.rightNode);
            if (currentNode.leftNode != null) myStack.push(currentNode.leftNode);
        }
    } // O(n) - time; O(n) - space
}
