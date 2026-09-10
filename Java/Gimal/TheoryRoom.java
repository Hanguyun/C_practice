package Gimal;

public class TheoryRoom extends LectureRoom {

	public TheoryRoom(String roomNo, int capacity, String location, String department) {
		super(roomNo, capacity, location, department);
	}
	
	public void displayInfo() {
			System.out.println("[이론강의실]"+getRoomNo() +
								", 수용인원: "+capacity +
								", 위치: "+location +
								", 관리부서: " + department);
	}
}
