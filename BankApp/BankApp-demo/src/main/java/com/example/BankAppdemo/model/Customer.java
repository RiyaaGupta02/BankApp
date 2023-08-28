package com.example.BankAppdemo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
//mark the class as an Entity i.e. basically a Table in a relational database
@Data                   // part of Lombok lib to generate common boilerplate code such as getters, setters, equals(), hashCode(), and toString() keeps code concise
@Builder
// of Lombok creates builder pattern for creating instances of the class
@AllArgsConstructor
public class Customer<Contact> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private String firstName;
	private String lastName;
	private Long customerName;
	private String status;
	private String password;
	
	// Establishing a one-to-one relationship with the account
		@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
		private Account account;
	

	public Account getAccount() {
			return account;
	//		account.setCustomer(this);
		}

		public void setAccount(Account account) {
			this.account = account;
			
		}

	@Column(unique = true)             //so this all unique things
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Contact contactDetails;

	// Getter & Setter for the respective fields being created
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Long customerName) {
		this.customerName = customerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Contact getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Contact contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	       
}







