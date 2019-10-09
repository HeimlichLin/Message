package com.message.fetch.N1;

import java.io.File;

import com.message.common.code.DownloadMedidata;
import com.message.common.code.N1Code;
import com.message.fetch.N1.N1_A.N1AFetchControllerFactoryImpl;
import com.message.fetch.base.BaseFetchController;
import com.message.fetch.base.ProStatus;

/**
 * N1自主訊息寫入待處理紀錄控制器
 * @author 6284
 *
 */
public class N1FetchController extends BaseFetchController {

	public N1FetchController() {
		super(DownloadMedidata.N1);
	}
	
	public static void main(String[] args) {
		N1FetchController controller = new N1FetchController();
		controller.execute();
	}

	@Override
	protected ProStatus proFiles(File file) {
		try {
			if (file.getName().contains(N1Code.N1_A.getText())) {
				N1AFetchControllerFactoryImpl.get().proFiles(file);
//			} else if (file.getName().contains(N1Code.N1_B.getText())) {
			} else {
				return ProStatus.FAIL;
			}			
			return ProStatus.FINISH;
		} catch (Exception e) {
//			LOGGER.error("N1 proFiles error:" + e.getMessage(), e);
			return ProStatus.FAIL;
		}
	}
}
