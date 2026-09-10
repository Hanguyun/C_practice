package Gimal;

public class PracticeRoom extends LectureRoom {
	String purpose;
	String equipment;
	
	public PracticeRoom(String roomNo, int capacity, String location, String department, String purpose, String equipment) {
		super(roomNo, capacity, location, department);
		
		this.purpose = purpose;
		this.equipment = equipment;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getEquipment() {
		return equipment;
	}
	
	@Override
	public void displayInfo() {
	    System.out.println(
	        "[실습강의실] " + roomNo
	        + ", 수용인원: " + capacity
	        + ", 위치: " + location
	        + ", 관리부서: " + department
	        + ", 용도: " + purpose
	        + ", 보유장비: " + equipment
	    );
	}

}
