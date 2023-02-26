package week2.day4;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Bhargavi";
		int charlength = name.length();
		System.out.println(charlength);
		char[] charArray = name.toCharArray();
			for(int i=charArray.length-1; i>=0; i--) {
				System.out.println(charArray[i]);
			} 
			String a = "anjali";
			String uppercase= a.toUpperCase();
			System.out.println(uppercase);
				
			{
			String b = "ANJALI";
			String lowercase = b.toLowerCase();
					System.out.println(lowercase);
			

			}
			String c="changeme";
			int len=c.length();
			if(len%2==0)
				System.out.println();
			
		}
	}



