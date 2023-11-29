package com.login.dto;

public class Criteria {
	//사용자의 요청 정보가 없는경우를 대비해 초기값을 설정
	int pageNo = 1; 	// 사용자의 요청 정보
	int amount = 10; 	// 사용자의 요청 정보
	
	// 페이징 처리를 위한 쿼리문에 사용
	int startNo, endNo;
	
	// 기본생성자
	public Criteria() {}
	
	// 바로 보내기 위해 String으로
	public Criteria(String pageNo, String amount) {
		try {
			if(pageNo != null && !"".equals(pageNo)) {
				this.pageNo = Integer.parseInt(pageNo);
			}
			if(amount != null && !"".equals(amount)) {
				this.amount = Integer.parseInt(amount);			
			}
			
		} catch (Exception e) {
			System.out.println("pageNo : " + pageNo);
			System.out.println("amount : " + amount);
			System.out.println("pageNo, amount에 문자가 포함 되었을수있다.");
		}
			
		// 시작번호와 끝번호 세팅
		endNo = this.pageNo * this.amount;
		startNo = endNo - (this.amount-1);
			
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	
	
}
