package singlecton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlecton s = singlecton.singlecton();
		singlecton s2 = singlecton.singlecton();
		singlecton s3 = singlecton.singlecton();

		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
	}

}
