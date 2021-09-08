package AbstractFactory;

public abstract class CreditCardFactory {
	
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		
		if(creditScore>650)
		{
			return new AmexFactory();
		}
		else
		{
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);
	
	public static void main(String args[])
	{
		CreditCardFactory abstractFactory=CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard creditCard=abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(creditCard.getClass());
		
		abstractFactory=CreditCardFactory.getCreditCardFactory(600);
		creditCard=abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(creditCard.getClass());
	}
}
