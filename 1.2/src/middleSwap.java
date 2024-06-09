
public class middleSwap {

	public static void main(String[] args) {
		String str1= "flapjack";
		String mid21= str1.substring(2,4);
		String mid22= str1.substring(4,6);
		String last2= str1.substring(6,8);
		String first2= str1.substring(0,2);
		String result= (first2+mid22+mid21+last2);
		System.out.println ("Initial word: flapjack");
		System.out.println();
		System.out.print("New word: "+result);
		System.out.println();
	}

}
