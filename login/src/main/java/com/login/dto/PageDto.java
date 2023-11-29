package com.login.dto;

public class PageDto {
	
	// 페이브 블럭을 생성하기 위해 필요한 변수
	int startNo;
    int endNo;
    int realEnd;
 	boolean prev;
 	boolean next;
 	
 	// 페이지 블럭을 생성하기 위해 필요한 변수에 값을 넣기 위해서 필요한 값
 	int total;			// 총 게시물의 건수
 	Criteria cri;		// 페이지번호, 페이지당 게시물의 수
 	int blockAmount = 10;	// 하나의 페이지 블럭에서 보여줄 페이지 갯수
 	
 	public PageDto(int total, Criteria cri) {
 		super();
 		this.total = total;
 		this.cri = cri;
 		
 		endNo = (int) Math.ceil(cri.getPageNo()/(blockAmount*1.0)) * blockAmount;
 		startNo = endNo - (blockAmount -1);
 		
 		// 게시글이 66건일 경우 끝페이지 번호는 7페이지가 됩니다.
 		// 하지만 페이지블럭의 끝번호는 10번으로 계산이 되므로 끝번호를 다시 설정해 주어야합니다.
 		realEnd = (int)(Math.ceil(total*1.0)/cri.getAmount());
 		endNo = endNo > realEnd ? realEnd : endNo;
 		
 		// 페이지 블럭 (앞으로가기, 뒤로가기)버튼
 		prev = startNo > 1 ? true : false;
 		next = endNo < realEnd ? true : false;
 		
 		System.out.println("시작번호 : " + startNo);
			System.out.println("끝번호 : " + endNo);
			System.out.println("진짜끝번호 : " + realEnd);
			System.out.println("prev : " + prev);
			System.out.println("next : " + next);
			System.out.println("============");
			System.out.println("요청페이지번호 : " + cri.getPageNo());
			System.out.println("페이지당 게시물의 수 : " + cri.getAmount());
			System.out.println("총 게시물의 수 : " + total);
			
 	}
 	
 	public PageDto(int total, Criteria cri, String blockAmount) {
 		// 생성자를 호출
 		this(total, cri);	
 		if(blockAmount != null && !"".equals(blockAmount)) {
 			this.blockAmount = Integer.parseInt(blockAmount);
 			
 		}
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
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean preve) {
		this.prev = preve;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	public int getBlockAmount() {
		return blockAmount;
	}
	public void setBlockAmount(int blockAmount) {
		this.blockAmount = blockAmount;
	}
	
	

}
