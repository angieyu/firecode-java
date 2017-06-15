import utilityClasses.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.System.out;

/**
 * Created by angie on 6/14/17.
 */

public class IterativePreorderTraversal {
    public static ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> nodeList = new ArrayList<>();
        Stack myStack = new Stack();
        if (root == null) return nodeList;
        myStack.push(root);
        while (!myStack.empty()) {
            TreeNode popped = (TreeNode) myStack.pop();
            nodeList.add(popped.data);
            if (popped.right != null) myStack.push(popped.right);
            if (popped.left != null) myStack.push(popped.left);
        }
        return nodeList;
    }

    public static void main(String[] args) {
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n3 = new TreeNode(3, n6, n7);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n1 = new TreeNode(1, n2, n3);
        out.println(preorderItr(n1));
    }
}
