/*
 * Postorder (Left, Right, Root) : 4 5 2 3 1
 * 
 * Algorithm Postorder(tree)
   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   3. Visit the root.
 * 
 * 
 */



package trees;
public class Post_Order_Traversal1{
	TreeNode root;
	Post_Order_Traversal1()
	{
		root = null;
	}	
	void postOrder(TreeNode node)
	{
		if(node == null)
			return;
		postOrder(node.left);		
		
		postOrder(node.right);
		
		System.out.println(node.key);	
	}
	void postOrder()
	{
		postOrder(root);
	}
	public static void main(String[] args){
		Post_Order_Traversal1 tree=new Post_Order_Traversal1();
		
		tree.root = new TreeNode(1);		
		tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        
        
        
        tree.postOrder();
        

	}

}
