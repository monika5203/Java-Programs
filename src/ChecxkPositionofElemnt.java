import java.util.*;
public class ChecxkPositionofElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> list=new ArrayList <String>();
		list.add("Monika");
		list.add("Nakul");
		list.add("Ayra");
		list.add("Monika");
		list.add("Mona");

		System.out.println(list.indexOf("Ayra"));
		System.out.println(list.lastIndexOf("Mona"));
	}

}
