package Factory;

public class WebsiteFactory {
	
	public static Website getWebsite(WebsiteType siteType)
	{
		switch(siteType)
		{
			case BLOG:
			{
				return new Blog();
			}
			case SHOP:
			{
				return new Shop();
			}
			default:
			{
				return null;
			}
		}
	}
	
	
	public static void main(String args[])
	{
		Blog blog=(Blog)WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(blog.getPages());
		
		
		Website shop=WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(shop.getPages());
	}

}
