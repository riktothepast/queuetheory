package iface;

import methods.Mm1;
import methods.Mms;

public class Testing {

	Mms MmsMethod= new Mms();
	Mm1 Mm1Method= new Mm1();
	
	public Testing(){
		
	}
	
	public void DoStuff(){
		System.out.println("*****MMs*********");
		MmsMethod.setValues(100, 150, 4, 6);
		System.out.println(MmsMethod.getL());
		System.out.println(MmsMethod.getPo());
		System.out.println(MmsMethod.getPn());
		System.out.println(MmsMethod.getW());
		System.out.println(MmsMethod.getWq());
		System.out.println("*****MM1*********");
		Mm1Method.setValues(100, 150, 4, 0);
		System.out.println(Mm1Method.getL());
		System.out.println(Mm1Method.getPo());
		System.out.println(Mm1Method.getPn());
		System.out.println(Mm1Method.getW());
		System.out.println(Mm1Method.getWq());
	}
	
	public static void main(String args[]){
		new Testing().DoStuff();
	}
}
