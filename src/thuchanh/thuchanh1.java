package thuchanh;

import java.io.IOException;
import java.util.Scanner;

public class thuchanh1 {

	public static void GPTB1(int a, int b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			float x = (float) -b / a;
			System.out.println("Phuong trinh co nghiem: " + x);
		}

	}

	public static void GPTB2(int a, int b, int c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}
		} else {
			float x = b * b - 4 * a * c;
			if (x > 0) {
				float x1 = (float) ((-b + Math.sqrt(x)) / (2 * a));
				float x2 = (float) ((-b - Math.sqrt(x)) / (2 * a));
				System.out.println("Phuong trinh co hai nghiem phan biet x1=" + x1 + " x2= " + x2);
			} else if (x == 0) {
				float f = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep: " + f);
			} else {
				System.out.println("Phuong trinh co so vo nghiem");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char ch, con;
		do {
			System.out.println("m.Giai phuong trinh bac 1");
			System.out.println("h.Giai phuong trinh bac 2");
			System.out.println("Nhap lua chon");
			ch = (char) System.in.read();

			switch (ch) {
			case 'm':
				System.out.println("Nhap he so a: ");
				int a1 = sc.nextInt();
				System.out.println("Nhap he so b: ");
				int b1 = sc.nextInt();
				GPTB1(a1, b1);
				break;
			case 'h':
				System.out.println("Nhap he so a: ");
				int a2 = sc.nextInt();
				System.out.println("Nhap he so b: ");
				int b2 = sc.nextInt();
				System.out.println("Nhap he so bc: ");
				int c2 = sc.nextInt();
				GPTB2(a2, b2, c2);
				break;
			default:
				System.out.println("Lua chon khong hop le! ");
				break;

			}
			System.out.println("Ban co muon tiep tuc khong? (Y/N");
			con = (char) System.in.read();
			System.in.skip(ch);
			System.in.skip(con);

		} while (con == 'Y' || con == 'y');
	}
}
