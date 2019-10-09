package com.message.download.base;

import com.message.common.code.DownloadMedidata;
import com.message.common.utils.FolderUtils;

/**
 * 接收平台資料公用服務實作
 * @author 6284
 *
 */
public class BaseDequeueServiceImpl implements BaseDequeueService {
		
	@Override
	public void download(final BaseDequeueDTO dequeueDTO) {
		final DownloadMedidata medidata = dequeueDTO.getMedidata();
		this.createFolders(medidata);
		
		//TODO 下載檔案
		
	}
	
	/**
	 * 建立資料夾
	 * @param medidata
	 */	
	private void createFolders(DownloadMedidata medidata) {
		FolderUtils.createFolders(medidata.getPath());
	}

}
