import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer>list=new ArrayList<Integer>();
list.add(1);
list.add(7);
list.add(8);
list.add(3);

Object[] array=list.toArray();
for(Object object:array)
{
	System.out.println(object);
	
}
}

}
