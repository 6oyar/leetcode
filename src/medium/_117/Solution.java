package medium._117;

/**
 * 117. Populating Next Right Pointers in Each Node II
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 */
public class Solution {

    // [1,2,null,3,null,4,null,5]
    public static void main(String[] args) {
//        Node a1 = new Node(1);
//        Node a2 = new Node(2);
//        Node a3 = new Node(3);
//        Node a4 = new Node(4);
//        Node a5 = new Node(5);
//        Node a6 = new Node(6);
//        Node a7 = new Node(7);
//
//        a1.left = a2;
//        a1.right = a3;
//
//        a2.left = a4;
//        a2.right = a5;
//
//        a3.left = a6;
//        a3.right = a7;

        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);

        a1.left = a2;
        a2.left = a3;
        a3.left = a4;
        a4.left = a5;


        Solution s = new Solution();
        s.connect(a1);
    }

    public Node connect(Node root) {
        f(root,  0);
        return root;
    }

    public void f(Node node, int level) {
        if (node == null) {
            if (links == null)
                links = new Node[6001];
            return;
        }

        f(node.left,  level + 1);

        if (links[level] == null) {
            links[level] = node;
        } else {
            links[level].next = node;
            links[level] = node;
        }

        f(node.right,  level + 1);
    }

    static Node[] links;

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;
}