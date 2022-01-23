package week1.day1;

public class Mobile { //Created a Mobile class
	
	public static void main(String[] args) {
		Mobile mobileDetails=new Mobile(); //Created the object for Mobile class
		mobileDetails.SendMsg(); //Calling the SendMsg public method
		System.out.println(mobileDetails.MakeCall());  //Calling the MakeCall default method
		System.out.println(mobileDetails.SaveContact()); //Calling the SaveContact private method
	}
	 
	public void SendMsg() {  //Created the SendMsg method using public access specifiers
		System.out.println("Learing Selenium");
	}
	
	long MakeCall() {  //Created the SendMsg method using default access specifiers
		long mobileNumber=9986546654L;
		return mobileNumber;	
	}
 private boolean SaveContact() {   //Created the SendMsg method using private access specifiers
	 boolean saveMobileNumber=true;
	 return saveMobileNumber;
 }
}
