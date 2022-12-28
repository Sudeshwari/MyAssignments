package week1.day1;



public class MobileApp {
	 void makeCall() {
		 String mobileModel="andriod 8";
		 float mobileWeight=2.25f;
		 
 
		System.out.println("The mobile model is;"+" "+mobileModel);
		System.out.println("The mobile weight is;"+" "+mobileWeight);
	}
	 void sendSms() {
		 boolean fullyCharged=true;
		 int mobileCost=20000;
		 
		System.out.println("Is the mobile fully charged:"+" "+fullyCharged);
		
		System.out.println("The cost of the mobile is:"+" "+mobileCost);
		
		
		
	}
	public static void main(String[] args) {
		MobileApp m1=new MobileApp();
		m1.makeCall();
		m1.sendSms();
		
		System.out.println("this is my mobile");
		
	}

}
