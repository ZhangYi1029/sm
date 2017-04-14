package org.com.yi.spring_mybatis.pojos;

import java.util.List;

public class Page {

	private int page;
	private int rows;
	private int totalNumber;
	private int totalPage;
	private int index;
	private List<?> dataList;
	private List<?> seeklist;

	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Page(int page, int rows, int totalNumber, List<?> dataList) {
		super();
		this.page = page;
		this.rows = rows;
		this.totalNumber = totalNumber;
		this.dataList = dataList;
		this.totalPage = ((totalNumber) % this.rows) == 0 ? ((totalNumber) / this.rows)
				: (((totalNumber) / this.rows) + 1);
	}

	public Page(int page, int rows, int totalNumber, int totalPage, int index, List<?> dataList, List<?> seeklist) {
		super();
		this.page = page;
		this.rows = rows;
		this.totalNumber = totalNumber;
		this.totalPage = totalPage;
		this.index = index;
		this.dataList = dataList;
		this.seeklist = seeklist;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {

		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {

		this.totalNumber = totalNumber;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<?> getDataList() {
		return dataList;
	}

	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}

	public List<?> getSeeklist() {
		return seeklist;
	}

	public void setSeeklist(List<?> seeklist) {
		this.seeklist = seeklist;
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", totalNumber=" + totalNumber + ", totalPage=" + totalPage
				+ ", index=" + index + ", dataList=" + dataList + ", seeklist=" + seeklist + "]";
	}

}
