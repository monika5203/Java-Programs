
public class pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original= "Monnnikkka";
		char ch= 'n';
		int count=0;
		for(int i=0; i<Original.length(); i++)
		{
		if(Original.charAt(i)==ch)
		{
		count++;
		}
		}
		System.out.println(count);

}
}