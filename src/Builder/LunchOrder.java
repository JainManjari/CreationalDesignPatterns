package Builder;

public class LunchOrder {
	
	
	public static class Builder
	{
		
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		
		public LunchOrder build()
		{
			return new LunchOrder(this);
		}
		
		public Builder()
		{
			
		}
		
		public Builder bread(String bread)
		{
			this.bread=bread;
			return this;
		}
		
		public Builder condiments(String condiments)
		{
			this.condiments=condiments;
			return this;
		}
		
		public Builder dressing(String dressing)
		{
			this.dressing=dressing;
			return this;
		}
		
		public Builder meat(String meat)
		{
			this.meat=meat;
			return this;
		}
		
	}
	
	
	
	
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	
	private LunchOrder(Builder builder)
	{
		this.bread=builder.bread;
		this.condiments=builder.condiments;
		this.dressing=builder.dressing;
		this.meat=builder.meat;
	}
	

	public String getBread() 
	{
		return bread;
	}


	public String getCondiments() 
	{
		return condiments;
	}


	public String getDressing() 
	{
		return dressing;
	}



	public String getMeat() 
	{
		return meat;
	}





	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchOrder.Builder builder=new LunchOrder.Builder();
		
		builder.bread("gralic").condiments("spicy").dressing("tomatoes").meat("none");
		
		//LunchOrder lo=new LunchOrder(builder); //
		LunchOrder lo=builder.build();
		
		System.out.println(lo.getBread()+" "+lo.getCondiments());

	}

}
