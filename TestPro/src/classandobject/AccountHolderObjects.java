package classandobject;

public class AccountHolderObjects {
public static void main(String [] args)
	{
	AccountHolder tom = new AccountHolder();
	AccountHolder henry = new AccountHolder();
	AccountHolder sarah = new AccountHolder();
	
	tom.firstName= "Tom";
	tom.lastName= "Smith";
	tom.age=21;
	tom.accountBalance=10000;
	tom.testEligibilityForCreditCard();
	System.out.println("Is Tom eleigible for CC:" +tom.eligibleForCreditCard);
	
	
	henry.firstName= "Henry";
	henry.lastName= "Hill";
	henry.age=31;
	henry.accountBalance=20000;
	henry.testEligibilityForCreditCard();
	System.out.println("Is Henry eleigible for CC:" +henry.eligibleForCreditCard);
	
	
	
	sarah.firstName= "Sarah";
	sarah.lastName= "Smith";
	sarah.age=31;
	sarah.accountBalance=31000;
	sarah.testEligibilityForCreditCard();
	System.out.println("Is Sarah eleigible for CC:" +sarah.eligibleForCreditCard);
	
	}
}
