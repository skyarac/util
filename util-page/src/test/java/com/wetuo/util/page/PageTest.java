package com.wetuo.util.page;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PageTest {
	@Test
	public void testPagable() {
		List<String> datas = new ArrayList<String>();
		datas.add("China");
		datas.add("America");
		datas.add("English");
		datas.add("Rusian");
		datas.add("Austrilia");
		datas.add("Korea");
		datas.add("Italy");
		datas.add("Canada");
		datas.add("Brazil");
		datas.add("Germany");
		datas.add("Holland");
		datas.add("Newsland");
		datas.add("India");
		datas.add("Finland");
		datas.add("Irak");
		datas.add("France");
		System.out.println("共"+datas.size()+"条记录");
		
		Pagination pagination = new Pagination(20,3,datas.size());
		System.out.println("pageNo: "+pagination.getPageNo());
		System.out.println("pageSize: "+pagination.getPageSize());
		System.out.println("prePage："+pagination.getPrePage());
		System.out.println("totalCount: "+pagination.getTotalCount());
		System.out.println("totalPage: "+pagination.getTotalPage());
		System.out.println("第"+pagination.getPageNo()+"页的第一条记录是: "+pagination.getFirstResult());
		
		
		
	}
}
