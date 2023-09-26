import java.util.*;
public class DupicayePract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> ab=new ArrayList<Integer>();
		ab.add(1);
		ab.add(5);
		ab.add(8);
		ab.add(4);
		ab.add(7);
		ab.add(5);
		ab.add(1);
		ab.add(5);
		//System.out.println(ab);
		Set<Integer>sb=new LinkedHashSet<Integer>(ab);
		System.out.println(sb);
	}

}
