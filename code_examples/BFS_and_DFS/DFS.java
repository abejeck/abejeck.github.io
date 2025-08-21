package BFS_and_DFS;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS{
    public static List<String> traverse(Node node){

        Stack<Node> stack = new Stack<Node>();
        Set<Node> visitedSet = new HashSet<Node>();
        List<String> orderOfVisit = new ArrayList<String>();
        
        if (node == null){
            return null;
        }
        stack.push(node);

        while (!stack.isEmpty()){

           node = stack.pop();

           if (!visitedSet.contains(node)){
                visitedSet.add(node);
                orderOfVisit.add(node.data);
           }

           if (node.right != null){
            stack.push(node.right);
           }

           if (node.left != null){
                stack.push(node.left);
           }

        }  
        return orderOfVisit;
    }

}