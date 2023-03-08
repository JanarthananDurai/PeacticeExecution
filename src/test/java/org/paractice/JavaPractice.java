package org.paractice;

public class JavaPractice {
	
	public int modelPrivate() {

       int no =55;
       int num=55;
       return no+num;

	}
	
	public int newModel() {
		int a = 10, n =20;
		//System.out.println(a+n);
		return a+n;

	}
	
	public int newModel(int a, int b) {
		//int n =20;
		//System.out.println(a+n);
		return a+b;

	}
	
	public static void main(String[] args) {
		
		JavaPractice practice = new JavaPractice();
		int number = practice.newModel();
		System.out.println(number);
		//System.out.println(practice.newModel());
		System.out.println(practice.modelPrivate());
		
		practice.add();
	}

	public void add() {
		int i = newModel();
		int j = newModel(10,5);
		if (i<j) {
			System.out.println(i+ j);
		}
		
	}

}
