package BFS_and_DFS;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DfsTest{

    /**
     * Helper method to build a sample tree for testing.
     * The tree structure is:
     * A
     * /   \
     * B     C
     * / \   / \
     * D   E F   G
     *      \
     *       H
     */
    private Node buildSampleTree() {
        Node nodeH = new Node("H");
        Node nodeE = new Node(null, nodeH, "E");
        Node nodeD = new Node("D");
        Node nodeG = new Node("G");
        Node nodeF = new Node("F");
        Node nodeB = new Node(nodeD, nodeE, "B");
        Node nodeC = new Node(nodeF, nodeG, "C");
        return new Node(nodeB, nodeC, "A");
    }

    /**
     * Test case for a DFS traversal on a standard, non-empty tree.
     * Verifies that the traversal order matches the expected DFS pre-order.
     */
    @Test
    void testStandardTreeTraversal() {
        Node root = buildSampleTree();
        List<String> expected = Arrays.asList("A", "B", "D", "E", "H", "C", "F", "G");
        List<String> actual = DFS.traverse(root);
        assertEquals(expected, actual, "Traversal order should match expected DFS pre-order.");
    }

    /**
     * Test case for a DFS traversal on a tree with only a single node.
     * The traversal should return a list containing only the root's data.
     */
    @Test
    void testSingleNodeTree() {
        Node root = new Node("A");
        List<String> expected = Arrays.asList("A");
        List<String> actual = DFS.traverse(root);
        assertEquals(expected, actual, "Traversal of a single node tree should return just that node.");
    }

    /**
     * Test case for a DFS traversal on an empty tree (null root).
     * The traversal should return an empty list.
     */
    @Test
    void testEmptyTree() {
        Node root = null;
        List<String> expected = null;
        List<String> actual = DFS.traverse(root);
        assertEquals(expected, actual, "Traversal of a null tree should return an empty list.");
    }

    /**
     * Test case for a DFS traversal on a left-skewed tree.
     * The traversal should follow the single path down the left side.
     * Tree: A -> B -> C
     */
    @Test
    void testLeftSkewedTree() {
        Node root = new Node(new Node(new Node("C"), null, "B"), null, "A");
        List<String> expected = Arrays.asList("A", "B", "C");
        List<String> actual = DFS.traverse(root);
        assertEquals(expected, actual, "Traversal of a left-skewed tree should follow the path.");
    }

    /**
     * Test case for a DFS traversal on a right-skewed tree.
     * The traversal should follow the single path down the right side.
     * Tree: A -> B -> C
     */
    @Test
    void testRightSkewedTree() {
        Node root = new Node(null, new Node(null, new Node("C"), "B"), "A");
        List<String> expected = Arrays.asList("A", "B", "C");
        List<String> actual = DFS.traverse(root);
        assertEquals(expected, actual, "Traversal of a right-skewed tree should follow the path.");
    }
}