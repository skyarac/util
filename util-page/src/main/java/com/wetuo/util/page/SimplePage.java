package com.wetuo.util.page;

public class SimplePage implements Pageable {
	public static final int DEF_COUNT = 20;
	protected int pageNo = 1;
	protected int pageSize = 10;
	protected int totalCount = 0;

	public SimplePage() {
	}

	public SimplePage(int pageNo, int pageSize, int totalCount) {
		setTotalCount(totalCount);
		setPageSize(pageSize);
		setPageNo(pageNo);
		adjustPageNo();
	}

	public void adjustPageNo() {
		if (pageNo < 1) {
			pageNo = 1;
			return;
		}
		if (pageNo == 1) {
			return;
		}
		int tp = getTotalPage();
		if (pageNo > tp) {
			pageNo = tp;
		}
	}

	/*
	 * public static int cpn(Integer pageNo) { return (pageNo == null || pageNo < 1) ? 1 : pageNo; }
	 * 
	 */

	public int getTotalCount() {
		return totalCount;
	}

	public int getTotalPage() {
		int totalPage = totalCount / pageSize;
		if (totalPage == 0 || totalCount % pageSize != 0) {
			totalPage++;
		}
		return totalPage;
	}

	public int getPageSize() {

		return pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public boolean isFirstPage() {

		return pageNo <= 1;
	}

	public boolean isLastPage() {

		return pageNo >= getTotalPage();
	}

	public int getPrePage() {
		if (isFirstPage()) {
			return pageNo;
		} else {
			return pageNo - 1;
		}

	}

	public int getNextPage() {
		if (isLastPage()) {
			return pageNo;
		} else {
			return pageNo + 1;
		}

	}

	public void setTotalCount(int totalCount) {
		if (totalCount < 0) {
			this.totalCount = 0;
		} else {
			this.totalCount = totalCount;
		}
	}

	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			this.pageSize = DEF_COUNT;
		} else {
			this.pageSize = pageSize;
		}
	}

	public void setPageNo(int pageNo) {
		if (pageNo < 1) {
			this.pageNo = 1;
		} else {
			this.pageNo = pageNo;
		}
	}

}
