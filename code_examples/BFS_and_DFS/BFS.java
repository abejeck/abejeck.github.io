package BFS_and_DFS;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static List<String> traverse(Node node){

        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> visitedSet= new HashSet<Node>();
        List<String> orderOfVisit = new ArrayList<String>();
        if (node == null){
            return null;
        }

        queue.add(node);

        while (!queue.isEmpty()){

            node = queue.poll();

            if (!visitedSet.contains(node)){
                visitedSet.add(node);
                orderOfVisit.add(node.data);
            }
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return orderOfVisit;
    }
}