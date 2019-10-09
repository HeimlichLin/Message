package com.message.fetch.N1;

/**
 * N1自主訊息寫入待處理紀錄服務
 * @author 6284
 *
 */
public interface N1FetchService<PO> {
	
	/**
	 * 處理檔案
	 * @param n1FetchDTO
	 */
	void proFile(N1FetchDTO<PO> n1FetchDTO);
	
}
