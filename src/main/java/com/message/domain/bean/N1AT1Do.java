package com.message.domain.bean;

import java.math.BigDecimal;
 
public class N1AT1Do { 
 
	public enum COLUMNS { 
		CONTROL_NO("上傳檔名"), 
		RECV_TIME("接收時間"), 
		VERSION("上傳版次"), 
		SEQ_NO("資料序號")
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bfNo; 
	private String controlNo; 
	private java.sql.Timestamp recvTime; 
	private BigDecimal version; 
	private BigDecimal seqNo; 
	private String refBillNo; 
	private BigDecimal item; 
	private String outStorageArea; 
	private String commodityNo; 
	private String declNo; 
	private String itemNo; 
	private String declType; 
	private String extendDate; 
	private String extendDoc; 
	private String iConfirmed; 
	
	public String getBfNo() { 
		return bfNo; 
	} 
 
	public void setBfNo(String bfNo) { 
		this.bfNo = bfNo; 
	} 
 
	public String getControlNo() { 
		return controlNo; 
	} 
 
	public void setControlNo(String controlNo) { 
		this.controlNo = controlNo; 
	} 
 
	public java.sql.Timestamp getRecvTime() {
		return recvTime;
	}

	public void setRecvTime(java.sql.Timestamp recvTime) {
		this.recvTime = recvTime;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public String getiConfirmed() {
		return iConfirmed;
	}

	public void setiConfirmed(String iConfirmed) {
		this.iConfirmed = iConfirmed;
	}

	public void setItem(BigDecimal item) {
		this.item = item;
	}

	public String getRefBillNo() { 
		return refBillNo; 
	} 
 
	public void setRefBillNo(String refBillNo) { 
		this.refBillNo = refBillNo; 
	}
 
	public String getOutStorageArea() { 
		return outStorageArea; 
	} 
 
	public void setOutStorageArea(String outStorageArea) { 
		this.outStorageArea = outStorageArea; 
	} 
 
	public String getCommodityNo() { 
		return commodityNo; 
	} 
 
	public void setCommodityNo(String commodityNo) { 
		this.commodityNo = commodityNo; 
	} 
 
	public String getDeclNo() { 
		return declNo; 
	} 
 
	public void setDeclNo(String declNo) { 
		this.declNo = declNo; 
	} 
 
	public String getItemNo() { 
		return itemNo; 
	} 
 
	public void setItemNo(String itemNo) { 
		this.itemNo = itemNo; 
	} 
 
	public String getDeclType() { 
		return declType; 
	} 
 
	public void setDeclType(String declType) { 
		this.declType = declType; 
	} 
 
	public String getExtendDate() { 
		return extendDate; 
	} 
 
	public void setExtendDate(String extendDate) { 
		this.extendDate = extendDate; 
	} 
 
	public String getExtendDoc() { 
		return extendDoc; 
	} 
 
	public void setExtendDoc(String extendDoc) { 
		this.extendDoc = extendDoc; 
	} 
 
	public String getIConfirmed() { 
		return iConfirmed; 
	} 
 
	public void setIConfirmed(String iConfirmed) { 
		this.iConfirmed = iConfirmed; 
	}

	public BigDecimal getItem() {
		return item;
	} 
 
} 
