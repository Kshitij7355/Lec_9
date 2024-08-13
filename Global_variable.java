package lec9;

public class Global_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		int x =60;
		System.out.println(var);
		fun(x);
		System.out.println(var);
		

	}
	static int var =100;
	
	public static void fun(int x) {
		int a = 90;
		System.out.println(x);
		System.out.println(var);
		int var=19;
		//Global_variable.var=120;//chages reflect on local variable
		//System.out.println(Global_variable.var);
		System.out.println(var);
	}

}
