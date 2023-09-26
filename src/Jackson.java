
public class Jackson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original="Monika Sharma";
		String Text=" ";
		for(int i=0; i<Original.length(); i++)
		{
			char ch=Original.charAt(i);
					
			if(ch!=' ')
			{
				Text+=ch;
			}
		}
		System.out.println(Text);
	}

}
