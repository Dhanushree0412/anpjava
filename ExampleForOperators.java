package day2;

public class ExampleForOperators {

	public static void main(String[] args) {
		System.out.println("-------Arithmetic Operators------");
		
		int num1=30;
		int num2=40;
		System.out.println("Addition:"+(num1 + num2));
		System.out.println("Subtraction:"+(num1 - 12));
		System.out.println("Mutliplication:"+(num1 * 3));
		System.out.println("Division:"+(num1 / 10));
		System.out.println("Modulas:"+(num1 %3));
		
		
		System.out.println("-------Assignment Operators------");
		
		int x=10;
		x +=5; //x=x+5
		System.out.println("Value of x:"+x);
		x-=3; //x=x-3
		System.out.println("Value of x:"+x);
		x/=2; //x=x/2
		System.out.println("Value of x:"+x);
		x*=3; //x=x*3
		System.out.println("Value of x:"+x);
		
		
		System.out.println("-------Comparison Operators------");
		
		int a=10;
		int b=20;
		
		System.out.println(a<b); //True
		System.out.println(a<=5); //False
		System.out.println(b>a); //True
		System.out.println(b>=50);  //False
		System.out.println(a==b);  //False
		System.out.println(a!=b); //True
		
		
		
		System.out.println("-------Logical Operators------");
		
		int p=1;
		int q=2;
		boolean result=p<q && p==1;
		System.out.println(result); //True
		System.out.println(p<=4 || q==10); //True
		System.out.println(!true); //False
		System.out.println(!false); //True
		
		
		System.out.println("-------Unary Operators------");
		
		
		int n=20;
		int m= n++ + n-- + ++n + n++  +  n--  +  ++n  -  --n;
		System.out.println(n);
		System.out.println(m);
		
		
		System.out.println("-------Ternary Operators------");
		
		int number1= 200;
		int number2=300;
		
		int max= number1> number2 ? number1:number2;
		System.out.println("Maximum of"+number1 + "&" +number2+ "is:");
	}

}
