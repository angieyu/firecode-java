import utilityClasses.BTreePrinter;
import utilityClasses.TreeNode;

import static java.lang.System.out;

// for each node, check to see if the max value in the left subtree is less than the node's value
// check to see if the min value in the right subtree is greater than the node's value

// write find max value helper function. assign maxVal as the initial value. traverse through the left subtree,
// if a value is greater than the original maxVal, replace it

public class BstValidation {
    public static int maxValue(TreeNode root) {
        int maxVal = root.data;
        if (root.left != null) {
            maxVal = Math.max(maxVal, maxValue(root.left));
        }
        if (root.right != null) {
            maxVal = Math.max(maxVal, maxValue(root.right));
        }
        return maxVal;
    }

    public static int minValue(TreeNode root) {
        int minVal = root.data;
        if (root.left != null) {
            minVal = Math.min(minVal, minValue(root.left));
        }
        if (root.right != null) {
            minVal = Math.min(minVal, minValue(root.right));
        }
        return minVal;
    }

    public static boolean validateBST(TreeNode root) {
        if (root.left != null) {
            if (root.data > maxValue(root.left)) {
                validateBST(root.left);
            } else {
                return false;
            }
        }
        if (root.right != null) {
            if (root.data < minValue(root.right)) {
                validateBST(root.right);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        out.println("*****");
//        out.println(maxValue(m1));
//        out.println("*****");

        TreeNode m5 = new TreeNode(30, null, null);
        TreeNode m4 = new TreeNode(10, null, null);
        TreeNode m3 = new TreeNode(40, null, null);
        TreeNode m2 = new TreeNode(15, m4, m5);
        TreeNode m1 = new TreeNode(20, m2, m3);
        // expect false
        out.println(validateBST(m1));


        TreeNode t5 = new TreeNode(18, null, null);
        TreeNode t4 = new TreeNode(14, null, null);
        TreeNode t3 = new TreeNode(30, null, null);
        TreeNode t2 = new TreeNode(15, t4, t5);
        TreeNode t1 = new TreeNode(20, t2, t3);
        // expect true
        out.println(validateBST(t1));

        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n3 = new TreeNode(3, n6, null);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n1 = new TreeNode(1, n2, n3);
        // expect false
        out.println(validateBST(n1));

        TreeNode f3 = new TreeNode(15, null, null);
        TreeNode f2 = new TreeNode(30, null, null);
        TreeNode f1 = new TreeNode(20, f2, f3);
        // expect false
        out.println(validateBST(f1));
    }
}
