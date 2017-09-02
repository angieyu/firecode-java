import utilityClasses.TreeNode;

import static java.lang.System.out;

public class BstValidation {

    public static boolean validateBST(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n3 = new TreeNode(3, n6, null);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n1 = new TreeNode(1, n2, n3);
        out.println(validateBST(n1));
    }
}
