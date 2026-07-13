package DAY3;

import java.util.*;

public class IterativePostOrder {

    // Tree Node
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Solution Class
    static class Solution {

        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode current = stack.pop();
                result.add(current.val);

                // Push left first so right is processed first
                if (current.left != null) {
                    stack.push(current.left);
                }

                if (current.right != null) {
                    stack.push(current.right);
                }
            }

            // Reverse the Root-Right-Left order
            Collections.reverse(result);

            return result;
        }
    }

    // Main Method
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();

        List<Integer> ans = sol.postorderTraversal(root);

        System.out.println(ans);
    }
}