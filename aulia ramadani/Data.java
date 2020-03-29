import java.util.Scanner;

public class Data{

	

	public static void main(String[] args){

		String nama, nim, jurusan, fakultas;

		Scanner input = new Scanner(System.in);

		

		System.out.print("Input nama : ");

			nama=input.nextLine();

		System.out.print("Input nim : ");

			nim=input.nextLine();

		System.out.print("Input jurusan : ");

			jurusan=input.nextLine();
		
		System.out.print("Input fakultas : ");

			fakultas=input.nextLine();

		

		

		System.out.println("\nHasil :\nData");

		System.out.println("nama 		: "+nama);

		System.out.println("nim		: "+nim);

		System.out.println("jurusan 	: "+jurusan);
		
		System.out.println("fakultas 	: "+fakultas);

		

	}



}