package com.umdmobile.tutoring.structures;

/*  @author UMD Mobile Apps Development Club
 * Modified by Sarthi on 3/2 at 5pm  
 * Last modified by Cameron on 4/15
 */

public class AbstractTaOrTutor {
	
	/***
	 * This abstract class will be extended to both TA and Tutor classes
	 * as it has common fields for both. 
	 * Currently all fields are private, and getters & setters are provided to manage them
	 * We can talk about making them mutable or not..*/

	private String firstName, lastName;
	private String phoneNumber;
	private String email;
	private int uniqueId;
	private String courses;
	
	/*
	 * Jackson should be the only thing that uses this default constructor.
	 */
	public AbstractTaOrTutor() {
	}
	
	
	//EventCalender <Event> availability   --- INCOMPLETE
	
	/* Max_int is much larger than the number of tutors + TAs we will have in next 1000 years
	 * i.e. it is safe and best to use "int" for unique IDs
	 * Courses will be a string with list of courses for TA/Tutor seperated by commas
	 * We may use subString functions later to search/extract from this*/
	
	/*(4/15/2013)
	 * Made this variable static so that not every TA or Tutor will start the id counter at 1
	 */
	static int counterId = 1; //Helps to keep track of IDs

	/**
	 * Constructs a new AbstractTaOrTutor object with all the fields. Unique ID is uniquely generated
	 * @param firstName The first name of the TA or Tutor
	 * @param lastName The last name of the TA or Tutor
	 * @param phoneNumber The phone number of the TA or Tutor
	 * @param email The email of the TA or Tutor
	 * @param courses The course list of the TA or Tutor
	 */
	public AbstractTaOrTutor (String firstName, String lastName, String phoneNumber, String email, String courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.uniqueId = counterId++; //increments id counter after assigning it
		this.courses = courses;
	}
	
	/** Getters*/
	
	/**
	 * Returns the first name of the TA or Tutor
	 * @return The first name of the TA or Tutor
	 */
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the last name of the TA or Tutor
	 * @return The last name of the TA or Tutor
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Returns the email of the TA or Tutor
	 * @return The email of the TA or Tutor
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Returns the Unique ID of the TA or Tutor
	 * @return The Unique ID of the TA or Tutor
	 */
	public int getUniqueId() {
		return uniqueId;
	}
	
	/**
	 * Returns the phone number of the TA or Tutor
	 * @return The phone number of the TA or Tutor
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Returns the course string of the TA or Tutor
	 * @return The course string of the TA or Tutor
	 */
	public String getCourses() {
		return courses;
	}
	
	/** Setters **/

	/**
	 * 
	 * @param newUniqueId
	 */
	void setUniqueId(int newUniqueId) {
		if(newUniqueId >= counterId) {
			counterId = newUniqueId + 1;
		}
		uniqueId = newUniqueId;
	}
	
	/**
	 * Sets the first name of the TA or Tutor
	 * @param newFirstName The new first name for the TA or Tutor
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}	

	/**
	 * Sets the last name of the TA or Tutor
	 * @param newLastName The new last name for the TA or Tutor
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	/**
	 * Sets the phone number of the TA or Tutor
	 * @param newPhoneNumber The new phone number for the TA or Tutor
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	
	/**
	 * Sets the email of the TA or Tutor
	 * @param newEmail The new phone number for the TA or Tutor
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	
	/**
	 * Sets the courses string of the TA or Tutor
	 * @param newEmail The new courses for the TA or Tutor
	 */
	public void setCourses(String newCourses) {
		courses = newCourses;
	}

}
