import java.util.Scanner;

// Á¶°Ç¹®
//		if - else if - else
//		switch - case

public class CSMain4 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("ÀÌ¸§ : ");
		String name = k.next();
		System.out.println("-------------");
		// ±è±æµ¿ : ¹»ºÁ
		// ´Ù¸¥ÀÌ¸§ : xxx¾¾ ¾È³ç Ãâ·Â
		if (name.equals("±è±æµ¿")) {
			System.out.println("¹» ºÁ");
		} else {
			System.out.println(name + "¾¾ ¾È³ç");
		}
		
		System.out.println("-------------");
		// switch - case »ç¿ë : case¿¡ ¼ýÀÚ¸¸ µé¾î°¡´Â °ÍÀº ¾Æ´Ï´Ù.
		switch (name) {
		case "±è±æµ¿":
			System.out.println("¹» ºÁ");
			break;
		case "¹Ú±æµ¿":
			System.out.println("¾È³çÇÏ½Ê´Ï±î");
			break;
		default:
			System.out.println(name + "¾¾ ¾È³ç");
			break;
		}
	}

}
