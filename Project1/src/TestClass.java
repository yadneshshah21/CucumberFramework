
public  class TestClass {

	
	
	public static void main(String[] args) 
	{
//		String str1 = "ABCDE";
//		
//		String str2 = new String("ABCDE");
//		System.out.println(str1.hashCode()+" "+str2.hashCode());
//		System.out.println(str1 == str2);
//		
//		System.out.println(str1.equals(str2));
//		
//		int a = 10;
		
		int[] arr = {28,3,15,9,17,54,23,2};
		int val = arr[0];
		
		System.out.println(val);
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] > val) {
				val = arr[i];
			}
		}
		System.out.println("Largest Number : "+val);
		

	}

}
