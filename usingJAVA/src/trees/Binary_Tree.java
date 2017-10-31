package trees;

public class Binary_Tree {
		
	TreeNode root;
	Binary_Tree()
	{
		root = null;
	}
	public static void main(String[] args) {		
		Binary_Tree tree= new Binary_Tree();

		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);

		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);	
		
		
		//getting values
		System.out.println(tree.root.key);
		
		
		
	}

}
