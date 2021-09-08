package AbstractFactory;

public class AmexFactory extends CreditCardFactory{

	public CreditCard getCreditCard(CardType cardType) {
		// TODO Auto-generated method stub
		switch(cardType)
		{
			case GOLD:
			{
				return new AmexGoldCreditCard();
			}
			case PLATINUM:
			{
				return new AmexPlatinumCreditCard();
			}
			default:
			{
				break;
			}
		}
		return null;
	}

	public Validator getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		switch(cardType)
		{
			case GOLD:
			{
				return new AmexGoldValidator();
			}
			case PLATINUM:
			{
				return new AmexPlatinumValidator();
			}
			default:
			{
				break;
			}
		}
		return null;
	}

}
