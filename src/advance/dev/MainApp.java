
package advance.dev;

import java.util.Iterator;
import java.util.Scanner;
public class MainApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 5 nguoi");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap vao nguoi thu: " + (i+1));
			arr[i] = new Person(null, i, null, i, i);
			String name =sc.nextLine();
			sc.nextLine();
			
			int old=sc.nextInt();
			
			String address =sc.nextLine();
			
			int number = sc.nextInt();
			
			float dtb=sc.nextFloat();
			
		}
		// In ra danh sach 
		for (int i = 0; i < arr.length; i++) {
			Person p = arr[i];
			System.out.format("Name: %s - Old: %d - Adress: %s - number: %d - dtb: %2f", arr[i].name, arr[i].old, arr[i].address, arr[i].number, arr[i].dtb).println();
		}
	}
}