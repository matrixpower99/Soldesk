// 紺啄奄

public class RSMain2 {
	public static void main(String[] args) {
		// せせせせせ
		// せせせせせ
		// せせせせせ
		// せせせせせ
		// せせせせせ
		for (int x = 0; x < 5; x++) { // 楳
			for (int y = 0; y < 5; y++) { // 伸
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// せ
		// せせ
		// せせせ
		// せせせせ
		// せせせせせ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) { // 暁澗 j < i +1稽 繕闇聖 匝 呪 赤生蟹 j <= i亜 希 娃衣廃 坪球
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// せせせせせ
		// せせせせ
		// せせせ
		// せせ
		// せ
		for (int i = 0; i < 5; i++) { // 乞骨岩照
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

//		for (int i = 0; i < 5 ; i++) { // 鎧 坪球
//			for (int j = 5; j > 0; j--) {
//				System.out.print((j > i) ? "せ" : " ");
//			}
//			System.out.println();
//		}

		// せ
		// せせ
		// せせせ
		// せせせせ
		// せせせせせせ
		for (int i = 0; i < 5; i++) { // 悪紫還 坪球
			for (int j = 0; j < 5; j++) {
				System.out.print((j > (3 - i)) ? "せ" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = 5; i > 0; i--) { // 鎧 坪球
			for (int j = 1; j < 6; j++) {
				System.out.print((j >= i) ? "せ" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// せ
		// せ
		// せ
		// せ
		// せ
		for (int i = 0; i < 5; i++) { // 置段坪球
			for (int j = 0; j < 5; j++) {
				System.out.print((i == j) ? "せ" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = 0; i < 5; i++) { // 悪紫還 呪舛 坪球. 呪俳旋 紫壱亜 琶推.
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("せ");
		}
		System.out.println("-----------------");

		// せ 1
		// ぞぞ 3
		// せせせせ 5
		// ぞぞぞぞぞぞ 7
		// せせせせせせせせせせせ 9
		// 置段坪球 : 伊紫判呪 弦製 -> CPU研 弦戚 紫遂
		// 伊紫判呪 姶社, 痕呪研 紫遂 -> RAM聖 弦戚 紫遂
		String a = "";
		for (int i = 0; i < 5; i++) {
			a = (i % 2 == 1) ? "ぞ" : "せ"; // 呪舛 坪球. 2腰属 欠鴇 宜奄 穿拭 i葵戚 筈呪昔走 端滴
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("-------------------");

		String[] s = { "せ", "ぞ" }; // 置曽 呪舛 坪球
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(s[i % 2]);
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
}
