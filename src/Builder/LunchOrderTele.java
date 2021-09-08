package Builder;

public class LunchOrderTele {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	
	public LunchOrderTele(String bread)
	{
		this.bread=bread;
	}
	
	
	public LunchOrderTele(String bread,String condiments)
	{
		this(bread);
		this.condiments=condiments;
	}
	
	
	public LunchOrderTele(String bread,String condiments,String dressing)
	{
		this(bread,condiments);
		this.dressing=dressing;
	}
	
	
	public LunchOrderTele(String bread,String condiments,String dressing,String meat)
	{
		this(bread,condiments,dressing);
		this.meat=meat;
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
		
		LunchOrderTele lob=new LunchOrderTele("gralic","spicy","tomat","none");
	
		
		System.out.println(lob.getBread()+" "+lob.getCondiments()+" "+lob.getDressing()+" "+lob.getMeat());

	}

}
