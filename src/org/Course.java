package org;

public class Course {

	private String course_id;
	private String course_name;
	private String batch;// B.Tech/M.Tech/M.Sc(IT)
	private int no_Of_Students;// number of students who enrolled for a particular course
	private int unallocated_strength;// number of students who are are still unallocated 
	//when algorithm is running
	private boolean processed;// all the students of this course are assigned a room and this course is 
	//successfully finished in allocation algorithm.
	private int flag_clash;//a flag to check that if it requires a gap of time interval
	private boolean broken;
	private String faculty;
	private int slot1priority;
	
	public Course(String course_id, String course_name,String batch, int no_Of_Students,String faculty)
	{
		this.course_id = course_id;
		this.course_name = course_name;
		this.no_Of_Students = no_Of_Students;
		this.batch=batch;
		this.unallocated_strength = this.no_Of_Students;
		this.processed = false;
		this.flag_clash=0;
		this.broken=false;
		this.faculty=faculty;
		this.slot1priority=0;
		
	}

	//copy constructor
	public Course(Course other)
	{
		this.course_id = other.getCourse_id();
		this.course_name = other.getCourse_name();
		this.no_Of_Students = other.getNo_Of_Students();
		this.unallocated_strength = other.getUnallocated_strength();
		this.processed = other.getProcessed();
		this.batch=other.getBatch();
		this.flag_clash=other.getFlag_clash();
		this.broken=other.broken;
		this.faculty=other.faculty;
		this.slot1priority=other.slot1priority;
	}
                                                                       
	public String getBatch() {
		return batch;
	}
	 public int getSlot1priority() {
		return slot1priority;
	}
	 public void setSlot1priority(int slot1priority) {
		this.slot1priority = slot1priority;
	}
	public int getFlag_clash() {
		return flag_clash;
	}
	public String getCourse_id() {
		return course_id;
	}
	public boolean getBroken()
	{
		return broken;
	}
	public String getCourse_name() {
		return course_name;
	}
	
	public int getNo_Of_Students() {
		return no_Of_Students;
	}
	
	public int getUnallocated_strength() {
		return unallocated_strength;
	}
	
	public boolean getProcessed()
	{
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}
	
	//"num" students are assigned a room for exam, so just (unallocated-num) students are still unallocated
	public void setUnallocatedStrength(int num) {
		unallocated_strength = unallocated_strength - num;
	}
//	public String toString()
//	{
//		return "Course ID: "+this.course_id+" Course_name: "+this.course_name;
//	}
	public String toString()
	{
		return this.course_id+" "+this.course_name+" "+this.no_Of_Students;
	}
	
	public void setBroken(boolean value)
	{
		this.broken=value;
	}
	 public void setFlag_clash(int flag_clash) {
		this.flag_clash = flag_clash;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	//sorting in descending order
	public int compareTo(Course other)
	{
		if(this.getNo_Of_Students()<other.getNo_Of_Students())
			return 1;
		else if(this.getNo_Of_Students()>other.getNo_Of_Students())
			return -1;
		else return 0;					
	}
}
