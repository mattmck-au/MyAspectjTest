package mattmck.testapp;

public class Test {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setCustomerId(1);
		c.setFirstName("Joe");
		c.setSurname("Smith");
		c.setComments("Some comments");
		
		
		System.out.println(c.test());
		
		System.out.println(c);
		
		
	}

}
