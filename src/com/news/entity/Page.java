package com.news.entity;

import java.util.List;

public class Page {
	private int totalPageCount = 6;//总页数
	private int pageSize = 5;//页面大小，即每页显示记录数
	private int totalCount = 0;//记录总数
	private int currPageNo = 1;//当前页码
	List<News> newsList;//每页新闻集合
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		
		if(totalCount>0) {
			this.totalCount = totalCount;
			//计算总页数
			totalPageCount = this.totalCount%pageSize==0?(this.totalCount/pageSize):this.totalCount/pageSize+1;
		}
		
		this.totalCount = totalCount;
	}
	public int getCurrPageNo() {
		return currPageNo;
	}
	public void setCurrPageNo(int currPageNo) {
		this.currPageNo = currPageNo;
	}
	public List<News> getNewsList() {
		return newsList;
	}
	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}
	
}
