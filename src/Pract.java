import java.util.*;
public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list=new ArrayList<String>();
		list.add("monika");
		list.add("neha");
		list.add("kavita");
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("nonika");
		list1.add("nk");
		list1.add("namita");
		list.addAll(list1);
		System.out.println(list);
		
	
	}

}
