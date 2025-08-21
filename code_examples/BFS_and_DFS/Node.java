package BFS_and_DFS;
/*
 * This is the node class used to define the nodes that will be used for the grpah searches. 
 */

public class Node{
    Node left; //A node has data, a left node, and a right node
    Node right;
    String data;

    public Node(String data){
        this.data = data; //it can be initialized with data and no children or a left and right child 
        this.right = null;
        this.left = null;
    }

    public Node(Node left, Node right, String data){
        this.data = data;
        this.right = right;
        this.left = left;
    }
}