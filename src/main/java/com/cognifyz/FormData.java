package com.cognifyz;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class FormData {

	    @NotEmpty(message = "Name is required")
	    private String name;

	    @NotEmpty(message = "Email is required")
	    @Email(message = "Email should be valid")
	    private String email;

	    @NotEmpty(message = "Password is required")
	    @Size(min = 6, message = "Password must be at least 6 characters")
	    private String password;

	    @Min(value = 18, message = "You must be at least 18 years old")
	    private int age;
	    
	    
	 // Getters and setters

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "FormData [name=" + name + ", email=" + email + ", password=" + password + ", age=" + age + "]";
		}

	    
	    
	    

	
}
