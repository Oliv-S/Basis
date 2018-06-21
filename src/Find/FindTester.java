package Find;

public class FindTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleTreeOfInt testTree = new SimpleTreeOfInt(3,5,3,2,1,6,8,7,9,0,5,3,6,7);
		testTree.DFS(0, 19);
		System.out.println();
		testTree.DFS(19);
		System.out.println();
		testTree.BFS( 19);
		
	}

}
