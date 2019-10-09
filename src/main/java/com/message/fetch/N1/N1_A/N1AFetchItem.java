package com.message.fetch.N1.N1_A;

public enum N1AFetchItem {
	T1("表頭資料", 0, 2, true), // 表頭(描述, 起始位置, 結束位置, 必填)
	BFNO("監管編號", 2, 14, true), // 監管編號
	REFBILLNO("參考單號", 14, 28, true), // 參考單號
	ITEM("項次", 28, 32, true), // 項次
	PRDTNO("料號", 32, 92, true), // 料號
	STRPOST("進出倉儲位", 92, 122, true), // 進出倉儲位
	DECLNO("報單號碼", 122, 136, true), // 報單號碼
	DECLTYPE("報單類別", 136, 138, true), // 報單類別
	ITEMNO("報單項次", 138, 142, true), // 報單項次
	EXTENDDATE("展延期限", 142, 150, true), // 展延期限
	EXTENDDOC("展延文號", 150, 350, true) // 展延文號
	;

	final String code;
	final String description;
	final int beginIndex;
	final int length;
	final boolean isMust;
	private static final String CHARSET = "BIG5";
	private static final int STANDARD_LEGTH = 350;

	private N1AFetchItem(String description, int beginIndex, int length,
			boolean isMust) {
		this.code = name();
		this.description = description;
		this.beginIndex = beginIndex;
		this.length = length;
		this.isMust = isMust;
	}

	public static String getCharset() {
		return CHARSET;
	}

	public static int getStandardLegth() {
		return STANDARD_LEGTH;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public int getBeginIndex() {
		return beginIndex;
	}

	public int getLength() {
		return length;
	}

	public boolean isMust() {
		return isMust;
	}

}
