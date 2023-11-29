package com.momo.lib.dto;

/**
 * 도서 테이블의 정보를 담아줍니다.
 */
public class BookDto {
	private String no;
	private String title;
	private String rentYn;
	private String author;
	private String rentYnStr;
	
	/**
	 * object 객체가 가지고있는 메서드 : '객체의이름@주소값'을 출력
	 */
	@Override
		public String toString() {
			return "[title : " + title + "]" ;
		}
		
	public BookDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BookDto(String no, String title, String author, String rentYn) {
		super();
		this.no = no;
		this.title = title;
		this.rentYn = rentYn;
		this.author = author;
		
		// rentYnStr = rentYn.equals("Y") ? "대여중" : "";
	}
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRentYn() {
		return rentYn;
	}
	public void setRentYn(String rentYn) {
		this.rentYn = rentYn;
		// Y/N대신에 대여/""으로 나오게하기
		this.setRentYnStr(rentYn.equals("Y") ? "대여중" : "");
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRentYnStr() {
		return rentYnStr;
	}

	public void setRentYnStr(String rentYnStr) {
		this.rentYnStr = rentYnStr;
	}
	
	
}
