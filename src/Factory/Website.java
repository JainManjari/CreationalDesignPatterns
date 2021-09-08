package Factory;

import java.util.*;

public abstract class Website {
	
	protected List<Page> pages=new ArrayList<Page>();

	public List<Page> getPages() {
		return pages;
	}
	
	
	public Website()
	{
		this.createWebsite();
	}


	public abstract void createWebsite();
	
	

}
