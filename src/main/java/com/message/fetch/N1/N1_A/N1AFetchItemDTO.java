package com.message.fetch.N1.N1_A;

import com.message.fetch.N1.N1FetchItemDTO;

/**
 * N1_A檔案內容與格式
 * @author 6284
 *
 */
public class N1AFetchItemDTO implements N1FetchItemDTO {

	private String text; // 原始內容
	private String t1; // 表頭
	private String bfNo; // 監管編號
	private String refbillno; // 參考單號
	private String item; // 項次
	private String prdtNo; // 料號
	private String strPost; // 進出倉儲位
	private String declNo; // 報單號碼
	private String declType; // 報單類別
	private String itemNo; // 報單項次
	private String extendDoc; // 展延期限	
	private String extendDate; // 展延文號
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getBfNo() {
		return bfNo;
	}

	public void setBfNo(String bfNo) {
		this.bfNo = bfNo;
	}

	public String getRefbillno() {
		return refbillno;
	}

	public void setRefbillno(String refbillno) {
		this.refbillno = refbillno;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPrdtNo() {
		return prdtNo;
	}

	public void setPrdtNo(String prdtNo) {
		this.prdtNo = prdtNo;
	}

	public String getStrPost() {
		return strPost;
	}

	public void setStrPost(String strPost) {
		this.strPost = strPost;
	}

	public String getDeclNo() {
		return declNo;
	}

	public void setDeclNo(String declNo) {
		this.declNo = declNo;
	}

	public String getDeclType() {
		return declType;
	}

	public void setDeclType(String declType) {
		this.declType = declType;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getExtendDoc() {
		return extendDoc;
	}

	public void setExtendDoc(String extendDoc) {
		this.extendDoc = extendDoc;
	}

	public String getExtendDate() {
		return extendDate;
	}

	public void setExtendDate(String extendDate) {
		this.extendDate = extendDate;
	}
	
}
