package Gimal;

public abstract class LectureRoom implements Reservable {
	String roomNo;
	int capacity;
	String location;
	String department;
	boolean reserved;
	
	public LectureRoom(String roomNo, int capacity, String location, String department) {
		this.roomNo = roomNo;
		this.capacity = capacity;
		this.location = location;
		this.department = department;
		this.reserved = false;
	}
	
	public void reserve() {
		if(reserved) {
			System.out.println("이미 예약되어 있습니다.");
		} else {
			reserved = true;
			System.out.println(roomNo + " 강의실 예약 완료.");
		}
	}
	
	public void cancelReservation() {
		if(reserved) {
			reserved = false;
			System.out.println(roomNo + " 강의실 예약 취소 완료.");
		} else {
			System.out.println("현재 예약이 되어있지 않습니다.");
		}
	}
	
	public void showReservation() {
		System.out.println(roomNo + " : " + (reserved?"예약중":"예약 가능"));
	}
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public boolean isReserve() {
		return reserved;
	}
	public abstract void displayInfo();
}
