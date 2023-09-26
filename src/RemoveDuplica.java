import java.util.*;
public class RemoveDuplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Write a java program to remove duplicates from a given array.
		//Input = [2,3,6,5,8,2,3] Output = [2,3,6,5,8]
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Set <Integer>s=new LinkedHashSet<Integer>(list);
		System.out.println(s);
	}

}
