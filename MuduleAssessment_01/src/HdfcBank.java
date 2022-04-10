import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

enum accountType {
	SAVINGS, DEMAT, CURRENT
}

enum STATUS {
	ACTIVE, INACTIVE, CLOSED
}

public class HdfcBank {

	private String ownerName;
	private double currentBalance;
	private LocalDate createdDate;
	private String city;
	private String state;
	private int pinCode;
	private long phoneNo;
	private int houseNo;
	private String street;
	private accountType type;
	private STATUS status;

	Scanner sc = new Scanner(System.in);

	public HdfcBank(String name, double initialAmount, accountType type, STATUS status) {

		if (initialAmount > 0.0) {

			this.ownerName = name;
			this.type = type;
			this.currentBalance = initialAmount;
			this.status = status;
			LocalDate date = LocalDate.now();
			this.createdDate = date;
		} else {
			System.out.println("Entered amount must be positive.");
		}
	}

	public void setAddress(String city, String state, int pinCode, long phoneNo, int houseNo, String street) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.phoneNo = phoneNo;
		this.houseNo = houseNo;
		this.street = street;
	}

	public void displayDetails() {

		System.out.println(" Account Holder Name : " + ownerName);
		System.out.println(" Current Balance : " + currentBalance);
		System.out.println(" Account Type : " + type);
		System.out.println(" Account Creation Date : " + createdDate);
		System.out.println(" Account Status : " + status);
		System.out.println(" City : " + city);
		System.out.println(" State : " + state);
		System.out.println(" Pincode: " + pinCode);
		System.out.println(" Phone Number : " + phoneNo);
		System.out.println(" House Number : " + houseNo);
		System.out.println(" Street : " + street);
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public accountType getType() {
		return type;
	}

	public void setType(accountType type) {
		this.type = type;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public void deposit(double depositAmount) {

		try {

			if (depositAmount <= 0) {
				System.out.println(" Deposit amount must be greater than 0 ");
			} else {
				System.out.println(" Deposition successfull ...");
				this.currentBalance += depositAmount;
			}
             System.out.println(" Deposit Amount : " + depositAmount);
			System.out.println(" Current Balance : " + currentBalance);
			System.out.println();

		} catch (InputMismatchException e) {
			System.out.println(" You entered invalid amount.");
		}
	}

	public void withdrawal(double withdrawAmount) {

		try {
			if (withdrawAmount > 0) {
				if (withdrawAmount <= currentBalance) {
					this.currentBalance -= withdrawAmount;
					System.out.println(" Wtihdrawal Successfull ...");
					System.out.println(" Withdrawal Amount : " + withdrawAmount);
					System.out.println(" Current Balance : " + currentBalance);
				} else {
					System.out.println(" Insufficient Balance");
					System.out.println(" Current Balance : " + currentBalance);
				}
			} else {
				System.out.println(" Amount should be positive...");
				System.out.println(" Current Balance : " + currentBalance);
				System.out.println();
			}

		} catch (InputMismatchException e) {
			System.out.println(" You entered invalid amount. ");
		}

	}
}
