package com.uok.oop.ims.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor  // Lombok annotation to generate an all-arguments constructor
@NoArgsConstructor   // Lombok annotation to generate a no-arguments constructor
@Data                // Lombok annotation to generate getter, setter, toString, equals, and hashCode methods
@Entity              // Specifies that this class is an entity
@Table(name = "client_details")  // Specifies the name of the database table associated with this entity
public class Client {
    public Client(String client_id, String client_NIC, String client_name, String client_address, String client_contact,
			String client_email) {
		super();
		this.client_id = client_id;
		this.client_NIC = client_NIC;
		this.client_name = client_name;
		this.client_address = client_address;
		this.client_contact = client_contact;
		this.client_email = client_email;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_NIC() {
		return client_NIC;
	}
	public void setClient_NIC(String client_NIC) {
		this.client_NIC = client_NIC;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getClient_address() {
		return client_address;
	}
	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}
	public String getClient_contact() {
		return client_contact;
	}
	public void setClient_contact(String client_contact) {
		this.client_contact = client_contact;
	}
	public String getClient_email() {
		return client_email;
	}
	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}
	@Id                     // Marks this field as the primary key
    private String client_id;       // Client's ID
    private String client_NIC;      // Client's NIC (National Identity Card) number
    private String client_name;     // Client's name
    private String client_address;  // Client's address
    private String client_contact;  // Client's contact information
    private String client_email;    // Client's email address
}
