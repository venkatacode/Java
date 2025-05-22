package stringdemo2;

public class StringDemo2 {
	private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public StringDemo2 change() {
		// Write your code here to implement the logic
		firstName.strip();
		middleName.strip();
		lastName.strip();

		return null;
	}

	public String generateInitials() {
		// Write your code here to implement the logic
		change();
		String intials = "";
//	    intials+=parseInt(firstName.charAt(0)).toString();
//	    intials+=parseInt(middleName.charAt(0)).toString();
//	    intials+=parseInt(lastName.charAt(0)).toString();

		if (!firstName.isEmpty()) {
			intials += firstName.charAt(0);
		}
		if (!middleName.isEmpty()) {
			middleName = "NA";
//				intials+=middleName.charAt(0);
		}
		if (!middleName.isEmpty()) {
			intials += middleName.charAt(0);
		}

		if (!lastName.isEmpty()) {
			intials += lastName.charAt(0);
		}
		return intials;
	}
}

class Tester {

	public static void main(String[] args) {

		StringDemo2 std1 = new StringDemo2();
		std1.setFirstName("Filius  ");
		std1.setMiddleName(" ");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());

	}
}
