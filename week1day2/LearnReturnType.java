package week1day2;

public class LearnReturnType {
	public int addNum(int a,int b,int c ) {
		return a+b+c;
		
		}
	public int mulNum(int a,int b) {
		return a*b;
		
	}
	public void divNum() {
		int a=20;
		int b=2;
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		LearnReturnType r1=new LearnReturnType();
		
			int finalSum=r1.addNum(3,4,5);
			System.out.println(finalSum);
			
			
			int finalMul=r1.mulNum(5, 10);
			System.out.println(finalMul);
			
			r1.divNum();
			

		
		
	}

}
