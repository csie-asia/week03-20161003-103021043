package hw;
/*
 * Topic:讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。 
 * Date: 2016/10/03
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw05_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("n:");
		int a=scn.nextInt();
		int x=0;
		int y=0;
		int i=1;
		while(i<=a){
			x=i*(i+1);
			y=y+x;
			i++;
		}
		System.out.print("答案為"+y);
	}
}
