
public class HdfcBank_Main {

	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank("Shubham", 100000, accountType.DEMAT, STATUS.ACTIVE); // Adding Account detail
		obj.setAddress("Kanpur", "U.P.", 231206, 898833634, 124, "Hemant Vihar"); // Adding Address detail

		obj.displayDetails(); // Display details

		System.out.println();

		obj.deposit(20000); // Deposit money into account
		obj.withdrawal(1000); // Withdrawal money from account

	}

}
