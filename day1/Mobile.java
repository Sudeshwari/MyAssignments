package week1.day1;

public class Mobile {
	public void sms() {
		System.out.println("send sms");
		}
	public void takeSnap() {
		System.out.println("take snap");
	}
	public static void main(String[] args) {
		Mobile mo=new Mobile();
		mo.sms();
		mo.takeSnap();
		
	}

}
