package InsertNodeinaBinarySearchTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(1);
		a.left = b;
		a.right = null;
		b.left = null;
		b.right = null;
		Solution s = new Solution();
		TreeNode c = new TreeNode(3);
		c.left = null;
		c.right = null;
		s.insertNode(a, c);
	}

}
