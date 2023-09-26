import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> lit = new ArrayList<String>();  
		lit.add("Monika");
		lit.add("Sharma");
		lit.add("Ayra");
		lit.add("Nakul");
		lit.add("Ayra");
		lit.add("Monika");
		//System.out.println(lit.toString());
		Set<String> s = new LinkedHashSet<String>(lit);  
        System.out.println(s);  
       
	}

}
