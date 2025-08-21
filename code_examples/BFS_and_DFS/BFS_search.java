package BFS_and_DFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class BFS_search {

    public static Node bfs_search(Node root, String target){
        if (root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> visitedSet = new HashSet<Node>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node curr_node = queue.poll();

            if (! visitedSet.contains(curr_node)){
                visitedSet.add(curr_node);

            }
            if (curr_node.data.equals(target)){
                return curr_node;
            }
            if (curr_node.left != null){
                queue.add(curr_node.left);
            }
            if (curr_node.right != null){
                queue.add(curr_node.right);
            }

        }
        return null;

    }
    
}
