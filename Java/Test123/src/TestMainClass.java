import java.util.Scanner;
import java.math.*;

public class TestMainClass {

	public static void main(String[] srt)
	{
		Scanner scan = new Scanner(System.in);
		Message("������� �����");
		Integer a = scan.nextInt();
		Message("������� ������");
		Integer b = scan.nextInt();
		Message("������� - "+String.valueOf(a*b));
		Message("����� ��������� - "+String.valueOf(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))));
	}
	
	public static void Message(String message)
	{
		System.out.println(message);
	}
	
}