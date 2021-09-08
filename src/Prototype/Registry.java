package Prototype;

import java.util.*;

public class Registry {
	
	private HashMap<String,Item> items=new HashMap<String, Item>();
	
	public Registry()
	{
		loadItems();
	}
	
	
	public Item createItem(String type)
	{
		Item item=null;
		
		try {
			
			item=(Item)(items.get(type)).clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return item;
	}
	
	
	private void loadItems()
	{
		Movie movie=new Movie();
		movie.setTitle("movie 1");
		movie.setPrice("24.99");
		movie.setRuntime("2 hours");
		
		items.put("Movie",movie);
		
		Book book=new Book();
		book.setNoOfPages(900);
		book.setPrice("2100");
		book.setTitle("book 1");
		
		items.put("Book",book);
	}
	
	
	
	public static void main(String args[])
	{
		Registry registry=new Registry();
		
		Movie movie=(Movie)registry.createItem("Movie");
		
		movie.setTitle("Harry Potter");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime()+" "+movie.getTitle()+" "+movie.getUrl());
		
		
        Movie movie2=(Movie)registry.createItem("Movie");
		
		movie2.setTitle("Harry Potter 2");
		
		System.out.println(movie2);
		System.out.println(movie2.getRuntime()+" "+movie2.getTitle()+" "+movie2.getUrl()+" "+movie.getTitle());
		
		System.out.println(registry.items.get("Movie").getTitle()+" "+registry.items.get("Book").getTitle());
		
		
	}

}
