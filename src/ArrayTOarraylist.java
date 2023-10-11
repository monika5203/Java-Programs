import java.util.*;

public class ArrayTOarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> list=new ArrayList <String>();
		list.add("monika");
		list.add("nakul");
		list.add("Ayra");
		list.add("vyas");
		System.out.println(list);
		Object[] array=list.toArray();
		for(Object object: array)
		{
			System.out.println(object);
		}
		
		
		
		
	}

}

