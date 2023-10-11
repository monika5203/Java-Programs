import java.util.*;
public class AddTwoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Add two arrayList
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("Monik");
		list1.add("bh");
		list1.add("ghg");
		System.out.println(list1);
		
		ArrayList <String> list2= new ArrayList<String>();
		list2.add("A");
		list2.add("v");
		list2.add("g");
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}
