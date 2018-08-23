/*
 * 二分木
*/
class BinaryTreeNode {
    String label;
    BinaryTreeNode left;
    BinaryTreeNode right;

    /**
     * @param label : Label
     * @param left  : 左部分木
     * @param right : 右部分木
     */
    BinaryTreeNode (String label, BinaryTreeNode left, BinaryTreeNode right) {
	this.left  = left;
	this.right = right;
	this.label = label;
    }

    /**
     * 二分木
     * @param p なぞるべき二分木
     */
    static void traversePreorder(BinaryTreeNode p) {
	if ( p == null ) // 木が空なら何もしない
	    return;
	System.out.println("Node" + p.label + "に立ち止まりました");
	traversePreorder(p.left);
	traversePreorder(p.right);
    }

    /**
     * 二分木を通りがけ順でなぞる
     *
     * @param p なぞるべき二分木
     */
    static void traverseInorder(BinaryTreeNode p) {
	if ( p == null )
	    return;
	traverseInorder(p.left);
	System.out.println("Node" + p.label + "に立ち止まりました");
	traverseInorder(p.right);
    }

    /**
     * @param p なぞるべき二分木
     */
    static void traversePostorder(BinaryTreeNode p) {
	if ( p == null ) 
	    return;
	traversePostorder(p.left);
	traversePostorder(p.right);
	System.out.println("Node" + p.label + "に立ち止まりました");
    }

    /**
     * テスト用メインルーチン
     * 行きがけ順，通りがけ順，帰りがけ順でなぞる
     */
    public static void main(String[] args) {
	BinaryTreeNode tree = new BinaryTreeNode("a",
						 new BinaryTreeNode("b",
								    new BinaryTreeNode("c", null, null),
								    null),
						 new BinaryTreeNode("d", null, null));
	// 行きがけ順
	System.out.println("行きがけ順");
	traversePreorder(tree);

	// 通りがけ順
	System.out.println("通りがけ順");
	traverseInorder(tree);

	// 帰りがけ順
	System.out.println("帰りがけ順");
	traversePostorder(tree);
    }
}
