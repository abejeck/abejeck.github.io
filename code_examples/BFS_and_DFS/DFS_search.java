package BFS_and_DFS;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS_search {
    public static Node dfs_search(Node root, String target){
        if (root == null){
            return null;
        }

        Stack<Node> stack = new Stack<Node>();
        Set<Node> visitedSet = new HashSet<Node>();

        stack.push(root);

        while (!stack.isEmpty()){
            Node curr_node = stack.pop();

            if (curr_node.data.equals(target)){
                return curr_node;
            }
            
            if (!visitedSet.contains(curr_node)){
                visitedSet.add(curr_node); 
           }

           if (curr_node.right != null){
            stack.push(curr_node.right);
           }

           if (curr_node.left != null){
                stack.push(curr_node.left);
           }
        }
        return null;
    }
}
