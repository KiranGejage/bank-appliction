import java.util.Scanner;
public class bank {
	static int bal =500;
	static void getBalance(){
		System.out.println("the balance is :"+bal);
		}
	static void deposit(int amt){
		bal =bal+amt;
	}
	static void withDraw(int amt){
		bal=bal-amt;
	}


	public static void main(String[] args) {
		int pin,count=3;
		int cpin=1234;
		System.out.println("WELCOME TO THE BANK");
		System.out.println("ENTER THE PIN");
		Scanner scan=new Scanner(System.in);
		pin=scan.nextInt();
		while(count!=1 && pin!=cpin) {
			System.out.println("ENTER THE PIN");
			pin=scan.nextInt();
			count--;
		}
		while(true) {
			if(pin==cpin) {
				System.out.println("1:bal 2:deposit 3:withdraw 4: exit");
				int a;
				a=scan.nextInt();	
				switch (a)
				{
				case 1:{ getBalance();
				break;
				}
				case 2:{
					int amt;
					System.out.println("enter the amount");
					amt=scan.nextInt();
					deposit(amt);
					break;
				}
				case 3:{
					int amt;
					System.out.println("enter the amount");
					amt=scan.nextInt();
					withDraw(amt);
					break;
				}
				default :{
					System.out.println("thank you");
					System.exit(0);
				}
				}
				}
			
			else if(count!=1) {
			}
			else {
				System.out.println("exceeded the attempts");
				break;
			}
		}
		System.out.println("thank you");
		
	}


}
