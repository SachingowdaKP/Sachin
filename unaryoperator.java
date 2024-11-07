package anps9531;

public class unaryoperator {

	public static void main(String[] args) {
//	    int a=10;
//      int b=a++;
//		int a=10;
//		int b=++a;
//		int a=10;
//		int b=a--;
		/*int a=5;
		//int b=--a;
		
		System.out.println("a:"+a);
	    //System.out.println(b);
        a++;
        System.out.println("a:"+a);
        a++;
        System.out.println("a:"+a);
        a--;
        System.out.println("a:"+a);
        --a;
        
        System.out.println("a:"+a);*/
		int a=10;
		int b=a++ + ++a + a++ + ++a - a-- + --a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
