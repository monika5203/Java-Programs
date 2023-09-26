
public class respacepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Original="I dont want to live";
String Text="";

for(int i=0; i<Original.length(); i++)
{
	char ch=Original.charAt(i);

if(ch !=' ')
{
	Text+=ch;

	}

}
System.out.println(Text);
}}