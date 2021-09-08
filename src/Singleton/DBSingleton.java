package Singleton;

import java.sql.SQLException;

public class DBSingleton {
	
	private static volatile DBSingleton instance=null;
	
	//so that people cant use new keyword to create new objects
	private DBSingleton() {
		
		if(instance!=null)
		{
			throw new RuntimeException("Use getIntsance() method");
		}
		
	} 
	
	public static DBSingleton getInstance()
	{
		if(instance==null)
		{
			synchronized (DBSingleton.class) {
				
				if(instance==null)
				{
					instance=new DBSingleton();
				}
				
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBSingleton instance=DBSingleton.getInstance();
		
		System.out.println(instance);
		
	    DBSingleton instance2=DBSingleton.getInstance();
		
		System.out.println(instance2);
		
	}

}
