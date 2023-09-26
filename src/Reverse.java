
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Original="Monika";
String Reverse="";
int len=Original.length();

for(int i=len-1; i>=0; i--)
{
Reverse=Reverse+Original.charAt(i)	;
}

	
	System.out.println(Reverse);

}
}
