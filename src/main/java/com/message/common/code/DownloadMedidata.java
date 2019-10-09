package com.message.common.code;

/**
 * deque設定檔案定義
 * @author 6284
 *
 */
public enum DownloadMedidata {
	
	N1(801) //
//	N2() // 尚未定義
	;
	
	final int lgQueId;
	final String cateogry;
	final String path;
	final String failPath;
	final String finishPath;
	
	private DownloadMedidata (final int lgQueId) {
		this.cateogry = this.name();
		
		/**
		 * 通用
		 */
		
		/**
		 * 差異
		 */
		this.lgQueId = lgQueId;
		this.path = FilePathCode.TXT.getPath();
		this.failPath = FilePathCode.TXT_FAIL.getPath();
		this.finishPath = FilePathCode.TXT_SUCCESS.getPath();

	}

	public int getLgQueId() {
		return lgQueId;
	}

	public String getCateogry() {
		return cateogry;
	}

	public String getPath() {
		return path;
	}

	public String getFailPath() {
		return failPath;
	}

	public String getFinishPath() {
		return finishPath;
	}

}
