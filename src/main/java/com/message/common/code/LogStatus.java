package com.message.common.code;

/**
 * Log狀態與代碼
 * @author 6284
 *
 */
public enum LogStatus {
	
	// N1_A Fetch
	N1_A_OK("N1AO", "N1.A處理成功"), //
	N1_A_FAIL("N1AE", "N1.A處理失敗"), //
	
	// N1_A Process
	N1_A_FINISH("N1AO", "N1.A更新成功"), //
	N1_A_UPDATE_ERROR("N1AE", "N1.A更新失敗"), //
	
//	N1_B // 尚未定義
//	N2_A // 尚未定義
	;
	
	final String name;
	final String code;
	final String text;

	private LogStatus(final String code, final String text) {
		this.name = name();
		this.code = code;
		this.text = text;
	}
	
	public String getName() {
		return name;
	}
	
	public String toCode() {
		return code;
	}

	public String getText() {
		return text;
	}
	
}
