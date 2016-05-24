package task3;

public class BSTSearch {
    public boolean exist(TreeNode root, int target) {
        if (root == null) return false;
        if (target == root.value) return true;
        else if (target < root.value) {
            return exist(root.left, target);
        }else return exist(root.right, target);
    }
}

class TreeNode {
    int value;
    TreeNode left, right;
}
