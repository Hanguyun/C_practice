package Gimal2;

import java.util.*;

public class LectureRoomMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<LectureRoom> roomList = new ArrayList<>();

	public static void main(String[] args) {
		roomList.add(new TheoryRoom("A101", 40, "1대학관", "IT학과"));
		roomList.add(new TheoryRoom("B201", 35, "2대학관", "기계과"));
		roomList.add(new PracticeRoom("LAB301", 30, "3대학관", "IT학과", "프로그래밍 실습", "PC 30대"));
		
		while (true) {
			System.out.println("\n===== 강의실 관리 프로그램 =====");
			System.out.println("1. 강의실 예약");
			System.out.println("2. 강의실 예약현황");
			System.out.println("3. 강의실 예약 취소");
			System.out.println("4. 강의실 추가");
			System.out.println("5. 강의실 삭제");
			System.out.println("6. 강의실 목록");
			System.out.println("7. 종료");
			System.out.print("메뉴 선택 : ");
			
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			 case 1: reserveRoom(); break;
			 case 2: showReservedRooms(); break;
			 case 3: cancelRoom(); break;
			 case 4: addRoom(); break;
			 case 5: deleteRoom(); break;
			 case 6: showRoomList(); break;
			 case 7: System.out.println("프로그램 종료"); System.exit(0);
			 default: System.out.println("잘못된 입력입니다!");
			}
		}
	}
	public static void reserveRoom() {
		System.out.print("예약할 강의실 번호: ");
		String roomNo = sc.nextLine();
		
		for(LectureRoom lr : roomList) {
			if(lr.getRoomNo().equals(roomNo)) {
				lr.reserve();
				return;
			}
		}
	}
	
	public static void showReservedRooms() {
		System.out.println("===== 예약 현황 =====");
		
		for(LectureRoom lr : roomList) {
			if(lr.isReserved()) {
				lr.showReservation();
			}
		}
	}
	
	public static void cancelRoom() {
		System.out.print("취소할 강의실 번호: ");
		String roomNo = sc.nextLine();
		
		for(LectureRoom lr : roomList) {
			if(lr.getRoomNo().equals(roomNo)) {
				lr.cancelReservation();
				return;
			}
		}
	}
	
	private static boolean checkDuplicate(String roomNo) {
		for(int i = 0; i < roomList.size();i++) {
			if(roomList.get(i).getRoomNo().equals(roomNo))
				return true;
		}
		return false;
	}
	
	public static void addRoom() {
		System.out.println("1. 이론강의실");
		System.out.println("2. 실습강의실");
		System.out.print("종류 선택: ");
		int type = Integer.parseInt(sc.nextLine());
		
		System.out.print("강의실 번호");
		String roomNo = sc.nextLine();
		if(checkDuplicate(roomNo)) {
			System.out.println(roomNo + "강의실이 등록되어 있습니다. 확인하고 진행해주세요.");
			return;
		}
		System.out.print("수용인원: ");
		int capactiy = Integer.parseInt(sc.nextLine());
		System.out.print("위치: ");
		String location = sc.nextLine();
		System.out.print("관리부서: ");
		String department = sc.nextLine();
		
		if(type == 1) {
			roomList.add(new TheoryRoom(roomNo, capactiy, location, department));
		}
		else {
			System.out.print("용도: ");
			String purpose = sc.nextLine();
			System.out.print("보유장비: ");
			String equipment = sc.nextLine();
			
			roomList.add(new PracticeRoom(roomNo, capactiy, location, department, purpose, equipment));
		}
		System.out.println("강의실 추가 완료.");
	}
	
	public static void deleteRoom() {
		
	}
	
	public static void showRoomList() {
		
	}
}
