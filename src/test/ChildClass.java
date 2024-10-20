package test;

import org.testng.annotations.Test;



public class ChildClass extends Parentclass {

		@Test
		public void run(){
			Airplaneseries();
		}
		
		@Test
		public void calculate(){
			Childclass2 childclass2 = new Childclass2(2);
			int a =2;
			System.out.println(childclass2.decrement());
			System.out.println(childclass2.increment());
			//usage of inheritance
			System.out.println(childclass2.multiplyby9());
		}
}
