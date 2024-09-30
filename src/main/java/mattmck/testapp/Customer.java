package mattmck.testapp;

import lombok.Data;

@Data
public class Customer {

	private Integer customerId;
	private String firstName;
	private String surname;
	private String comments;

	public String test() {
		return "TEST";
	}
	
}
