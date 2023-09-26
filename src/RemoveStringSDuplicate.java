import java.util.*;
public class RemoveStringSDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a java program to remove duplicates from a given string.
		//Input = “automation” Output = automin

ArrayList <String>list=new ArrayList<String>();
list.add("a");
list.add("u");
list.add("t");
list.add("o");
list.add("m");
list.add("a");
list.add("t");
list.add("i");
list.add("o");
list.add("n");
Set<String>sb=new LinkedHashSet<String>(list);
System.out.println(sb);
	}

}
