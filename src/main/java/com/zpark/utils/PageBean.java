package com.zpark.utils;

import java.util.List;

public class PageBean<T> {
	
	private Integer pageSize=3;//每页条数
	private Long totalNum;//总条数
	private Integer nowPage=1;//当前页
	
	private Integer pageNum;//总共页数
	private List<T> list;//封装每页要显示的数据
	private Integer startIndex=0;//起始位置
	
	public PageBean(Integer pageSize, Long totalNum, Integer nowPage, List<T> list) {
		super();
		if(pageSize!=null){
			this.pageSize = pageSize;
		}
		
		this.totalNum = totalNum;
		this.list = list;
		//计算一下总页数(分页公式)
		this.pageNum = (int) ((this.totalNum+this.pageSize-1)/this.pageSize);
		
		if(nowPage!=null){
			this.nowPage = nowPage;
			if(nowPage<1){
				this.nowPage = 1;
			}
			if(nowPage>this.pageNum){
				this.nowPage = this.pageNum;
			}
		}
		
		//计算起始位置
		this.startIndex = (this.nowPage-1)*this.pageSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getNowPage() {
		return nowPage;
	}

	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}

	public Integer getPageNum() {
		
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	
}
