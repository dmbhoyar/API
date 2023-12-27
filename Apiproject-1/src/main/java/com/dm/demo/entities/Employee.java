package com.dm.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
	public class Employee {
	    @Id
	    @Column(name="id")
	    private String id;
	    @Column(name="employeeName")
	    private String employeeName;
	    @Column(name="phoneNumber")
	    private String phoneNumber;
	    @Column(name="email")
	    private String email;
	    @Column(name="reportsTo")
	    private String reportsTo;
	    @Column(name="profileImag")
	    private String profileImage;
		public Employee(String id, String employeeName, String phoneNumber, String email, String reportsTo,
				String profileImage) {
			super();
			this.id = id;
			this.employeeName = employeeName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.reportsTo = reportsTo;
			this.profileImage = profileImage;
		}
		public Employee() {
			super();
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getReportsTo() {
			return reportsTo;
		}
		public void setReportsTo(String reportsTo) {
			this.reportsTo = reportsTo;
		}
		public String getProfileImage() {
			return profileImage;
		}
		public void setProfileImage(String profileImage) {
			this.profileImage = profileImage;
		}

	    
	    
	}


