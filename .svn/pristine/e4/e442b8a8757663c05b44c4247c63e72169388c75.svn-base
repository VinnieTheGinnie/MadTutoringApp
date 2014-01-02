package com.umdmobile.tutoring.structures;

/* @author UMD Mobile Apps Development Club
 * This class will contain the review for TA or Tutor
 * 
 * Last modified on 3/2 at 9pm by Sarthi
 */
public class Review {
	/**
	 * expectedGrade : The expected course grade for the student who reviews the TA or Tutor
	 * year : Academic year like "Freshman", "Sophomore", "Junior" or "Senior"
	 * course : The course of the review
	 * timeStamp : Time stamp of the review
	 * rating : The rating of the TA
	 */
	private String expectedGrade;
	private String comments;
	private String year;
	private String course;
	private String teacher;
	private String student;
	private long timeStamp;
	private int rating;
	private int id;
	
	//counter so no review gets the same id
	static int idcounter = 1;
	

	public Review(String expectedGrade, String year, String course, String teacher,	
			String student, String comments,	long timestamp, int rating) {
		this.expectedGrade = expectedGrade;
		this.year = year;
		this.course = course;
		this.timeStamp = timestamp;
		this.rating = rating;
		this.teacher = teacher;
		this.student = student;
		this.comments = comments;
		id= idcounter++;//increment the counter so each id is unique;
	}
	
	/** Getter Methods */

	
	/**
	 * gets the comments which is the actual written review of the TA
	 * @return comments
	 */
	public String getComments() {
		return comments;
	}


	/**
	 * Returns the grade associated with that review of TA or Tutor
	 * @return expectedGrade The grade predicted by Tutor for students
	 * */
	public String getExpectedGrade() {
		return expectedGrade;
	}
	
	/**
	 * Returns the academic year associated with that review of TA or Tutor
	 * @return year The academic year of the TA or Tutor
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * Returns the course name associated with that review of TA or Tutor
	 * @return course The course name for that review
	 */
	public String getCourse() {
		return course;
	}
		
	/**
	 * Timestamp of the review of the TA or Tutor
	 * @return timestamp The time stamp of the review of TA or Tutor
	 */
	
	public long getTimestamp() {
		return timeStamp;
	}
	
	/**
	 * Returns the rating of that review of TA or Tutor
	 * @return rating The rating of the review
	 */
	public int getRating() {
		return rating;
	}
	
	/**
	 * Returns the teacher of the course the student is taking
	 * @return
	 */
	public String getTeacher(){
		return teacher;
	}
	
	/**
	 * Returns the student reviewing this TA
	 * @return the student reviewing this TA
	 */
	public String getStudent(){
		return student;
	}
	
	/**
	 * Returns the id of this review
	 * @return the id of this review
	 */
	public int getUid(){
		return id;
	}

	/** Setter Methods*/
	
	/**
	 * sets the comments, the actual review of th TA
	 * @param comments
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	/**
	 * Sets the expected grade for the Tutor
	 * @param expectedGrade The new expected grade
	 */
	public void setExpectedGrade(String expectedGrade) {
		this.expectedGrade = expectedGrade;
	}
	
	/**
	 * Sets the academic year of the person who is reviewing TA or Tutor
	 * @param year academic year of the reviewer
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	/**
	 * Sets the course which is being reviewed
	 * @param course The course which has been reviewed
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * Sets the time stamp of the review
	 * @param timestamp The time stamp of the review
	 */
	public void setTimestamp(long timestamp) {
		this.timeStamp = timestamp;
	}
	
	public void setID(int id){
		//generate an id using java's hash function		
	}

	/**
	 * Sets the rating of the review
	 * @param rating rating of the review
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
