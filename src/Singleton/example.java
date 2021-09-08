package Singleton;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime instance1=Runtime.getRuntime();
		Runtime instance2=Runtime.getRuntime();
		
		System.out.println(instance1+" "+instance2);
		
		if(instance1==instance2)
		{
			System.out.println("Eq instances");
		}

	}

}
