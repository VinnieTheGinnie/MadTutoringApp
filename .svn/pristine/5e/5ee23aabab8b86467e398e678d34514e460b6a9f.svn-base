package com.umdmobile.tutoring.structures;

import java.util.ArrayList;

/*  @author UMD Mobile Apps Development Club
 * Modified by Sarthi on 3/2 at 9pm  
 * Last modified by Cameron on 4/15 */

/** TA class extends AbstractTaOrTutor
 * Local Field is officeLocation, officeHours*/

public class TA extends AbstractTaOrTutor {
	private String officeLocation;

	/**
	 * (Added 4/15/2013)
	 * 
	 * A list that holds the number of different starting hours for office hours for T.A. Uses military time format.
	 * Ex. T.A. office hours = {1300,1500,1700}.  Means the T.A. has hours that start at 1pm, 3pm, and 5pm.
	 * 
	 * A second list that holds the corresponding ending hours for T.A. office hours.  Also uses military time.
	 * Ex. T.A. office hours end = {1400,1530,1800}.  Means that T.A.'s office hours end at 2pm, 3:30pm, and 6pm.
	 * 
	 * Using the two lists together: office hours are from 1pm-2pm, 3pm-3:30pm, and 5pm-6pm.
	 * 
	 * Ensure that both lists are of equal length, and that the end times that correspond to the 
	 * start times are always greater.  Otherwise, throw error.
	 */

	private ArrayList<Integer> officeHoursStart;
	private ArrayList<Integer> officeHoursEnd;

	/**
	 * Constructs a new TA object with all the fields. Unique ID is uniquely generated
	 * @param newFirstName The first name of the TA
	 * @param newLName The last name of the TA
	 * @param newPhoneNumber The phone number of the TA
	 * @param newEmail The email of the TA
	 * @param newCourses The course list of the TA
	 * @param newOfficeLocation The office location of the TA
	 * 
	 * (Following added on 4/15/2013):
	 * 
	 * @param officeHoursStart The list of starting times for TA office hours
	 * @param officeHoursEnd The corresponding list of ending times for TA office hours
	 */
	
	public TA(String newFirstName, String newLastName, String newPhoneNumber,String newEmail, 
			String newCourses, String newOfficeLocation, ArrayList<Integer> officeHoursStart,
			ArrayList<Integer> officeHoursEnd) {

		super(newFirstName, newLastName, newPhoneNumber, newEmail, newCourses);
		officeLocation = newOfficeLocation;
		this.officeHoursStart = officeHoursStart;
		this.officeHoursEnd = officeHoursEnd;
	}

	/** 
	 * Getter to get office location of the TA
	 * @return officeLocation The office location of the TA
	 * */
	public String getOfficeLocation() {
		return officeLocation;
	}

	/**
	 * (Added 4/15/2013)
	 * 
	 * Getter for the list of starting times for TA office hours
	 * @return officeHoursStart The list of starting times for TA office hours
	 */
	public ArrayList<Integer> getOfficeHoursStart(){
		return officeHoursStart;
	}

	/**
	 * (Added 4/15/2013)
	 * 
	 * Getter for the list of ending times for TA office hours to go with
	 * list of starting hours
	 * @return officeHoursEnd The corresponding list of ending times for TA office hours
	 */
	public ArrayList<Integer> getOfficeHoursEnd(){
		return officeHoursEnd;
	}

	/** 
	 * Setter to set a new office location of the TA
	 * @param newOfficeLocation The new office location of the TA
	 * */
	public void setOfficeLocation(String newOfficeLocation) {
		officeLocation = newOfficeLocation;
	}

	
	/**
	 * (Added 4/15/2013)
	 * 
	 * Adds a starting hour to the list of starting hours for TA office Hours
	 * @param timeStart The time you want to be added to the list
	 * 
	 * If the list of starting hours is not the same size as the list of ending hours,
	 * throw an exception.  (The only possible instance that this should occur is when
	 * someone tries to add a two starting hours in a row without adding an ending time.
	 */
	public void addOfficeHourStart(int timeStart){
		if(officeHoursStart.size() == officeHoursEnd.size()){
			if(officeHoursStart.contains(timeStart) == true){
				return;
			}else{
				officeHoursStart.add(timeStart);
			}
		}else{
			//throw exception
		}


	}
	
	/**
	 * (Added 4/15/2013)
	 * 
	 * Adds an ending hour to the list of ending hours for TA office Hours
	 * @param timeEnd The time you want to be added to the list
	 * 
	 * The list of ending hours should be one less than the size of the starting
	 * hours list, because you should be adding an end time after adding a start time.
	 */
	public void addOfficeHourEnd(int timeEnd){
		if(officeHoursEnd.size() == officeHoursStart.size()-1){
			if(officeHoursEnd.contains(timeEnd) == true){
				return;
			}else{
				officeHoursEnd.add(timeEnd);
			}
		}else{
			//throw exception
		}
	}





}
