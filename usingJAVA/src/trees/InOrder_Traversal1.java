/*
 *     Inorder (Left, Root, Right)
 *     
 *         Algorithm Inorder(tree)
	   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
	   2. Visit the root.
	   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
 *    
 *    
 */




package trees;
public class InOrder_Traversal1 {	
	/*class TreeNode
	{
		int key;
		TreeNode left;
		TreeNode right;		
		public TreeNode(int item)
		{			
			key = item;			
			left = null;
			right = null;			
		}	
	} */
	
	TreeNode root;
	InOrder_Traversal1()
    {
        root = null;
    }
	
	void printInorder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		
		
		//  1) To Travell upto the   left NODE
		printInorder(node.left);
		
		System.out.println(node.key);

		
		
		// 3)  To Travese upto the right Node		
		printInorder(node.right);
		
		
		
		
		
	}
	
	
	void printInorder()
	{
		printInorder(root);
	}
	
	public static void main(String[] args) {
		
		InOrder_Traversal1 obj1 = new InOrder_Traversal1();
		
		
		obj1.root = new TreeNode(1);
		obj1.root.left = new TreeNode(2);		
		obj1.root.right = new TreeNode(3);

		obj1.root.left.left = new TreeNode(4);		
		obj1.root.left.right = new TreeNode(5);
		
		
		
		
		obj1.printInorder();     // calls a method...
		
		
		
		
		
		

	}

}
