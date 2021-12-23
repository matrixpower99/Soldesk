import java.util.Random;
import java.util.Scanner;

// È¦Â¦°ÔÀÓ

public class FMain7 {
	public static int getRandom(int x) {
		// ·£´ý »ÌÀ» ÁØºñ
		Random r = new Random();
		return r.nextInt(x) + 1; // ·£´ý ÇÔ¼ö´Â 0~n-1±îÁöÀÇ ³­¼ö¸¦ ¹ß»ý½ÃÅ°¹Ç·Î 1~n±îÁö ¹ß»ý½ÃÅ°±â À§ÇØ +1 
	}
	
	public static String getUchar() {
		Scanner k = new Scanner(System.in);
		System.out.print("¹¹(È¦/Â¦) : ");
		String a = k.next();
		return (a.equals("È¦") || a.equals("Â¦") ) ? a : getUchar();
	}
	
	public static String getOE(int un, int rn) {
		return ((un == 2 && rn % 2 != 0) || (un == 1 && rn %2 != 1)) ? "¶¯" : "Á¤´ä";
	}
	
	public static void printReport(String a, int b) {
		System.out.printf("ÄÄÇ»ÅÍ : %s\n", b);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// ÃÑ µ¹ °¹¼ö : 10
		// ÄÄÇ»ÅÍ°¡ 10°³ Áã°í Èçµé°¡´Ù ¸î °³ ¼Õ¿¡ Áã°í
		int max = 10;
		int rNum = getRandom(max);
		
		// ¹¹°Ô -> ´ë´ä
		String uc = getUchar();
				
		// ÆÇÁ¤
		int uNum = (uc.equals("È¦")) ? 1 : 2;
//		System.out.println(uNum);
		String result = getOE(uNum, rNum);
		printReport(result, rNum);
	}
}
