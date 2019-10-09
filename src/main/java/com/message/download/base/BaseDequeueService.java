package com.message.download.base;

/**
 * 接收平台資料公用服務
 * @author 6284
 *
 */
public interface BaseDequeueService {
	
	/**
	 * 執行
	 * @param baseDequeueDTO
	 */
	public void download(BaseDequeueDTO baseDequeueDTO);

}
