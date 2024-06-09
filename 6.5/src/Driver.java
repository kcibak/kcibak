import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner scanS=new Scanner(System.in);
		System.out.println("Word?: ");
		String input=scanS.nextLine();
		Password pass=new EncryptionReverseHalf(input);
		Password pass2=new EncryptionReverse(input);
		pass.encrypt(input);
		pass2.encrypt(input);
		

	}

}
