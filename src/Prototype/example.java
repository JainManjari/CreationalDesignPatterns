package Prototype;

import java.util.*;

public class example implements Cloneable {
	

	private String sql;
	private List<String> parameters;
	private Record record;
	
	public example(String sql,List<String> parameters,Record record)
	{
		this.sql=sql;
		this.parameters=parameters;
		this.record=record;
	}
	

	
	public example clone()
	{
		try
		{
			return (example) super.clone();
		}
		catch(CloneNotSupportedException e) 	{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	public String getSql() {
		return sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sql="Select * from Students";
		
		List<String> parameters=new ArrayList<String>();
		
		parameters.add("Star Wars");
		
		Record record=new Record();
		
		example instance1=new example(sql, parameters, record);
		
		System.out.println(instance1.getSql()+" "+instance1.getParameters()+" "+instance1.getRecord());
		
		example instance2=instance1.clone();
		
		
		System.out.println(instance2.getSql()+" "+instance2.getParameters()+" "+instance2.getRecord());
		
	}

}
