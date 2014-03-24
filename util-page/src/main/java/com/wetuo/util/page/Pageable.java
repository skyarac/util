package com.wetuo.util.page;

public interface Pageable {
	/**
	 * @return
	 * 		返回总记录数
	 */
	public int getTotalCount();
	/**
	 * @return
	 * 		返回总页数
	 */
	public int getTotalPage();
	/**
	 * @return
	 * 		每页显示记录数
	 */
	public int getPageSize();
	/**
	 * @return
	 * 		返回当前页号
	 */
	public int getPageNo();
	/**
	 * @return
	 * 		是否第一页
	 */
	public boolean isFirstPage();
	/**
	 * @return
	 * 		是否最后一页
	 */
	public boolean isLastPage();
	/**
	 * @return
	 * 		返回上一页编号
	 */
	public int getPrePage();
	/**
	 * @return
	 * 		返回下一页编号
	 */
	public int getNextPage();
}
