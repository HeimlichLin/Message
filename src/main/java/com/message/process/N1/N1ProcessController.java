package com.message.process.N1;

import com.message.common.code.N1Code;
import com.message.common.exception.ApBusinessException;
import com.message.process.base.BaseProcessController;

/**
 * N1自主訊息處理檔案控制器
 * @author 6284
 *
 */
public class N1ProcessController extends BaseProcessController {
	
	public static void main(String[] args) {
		N1ProcessController controller = new N1ProcessController();
		controller.doProcess();
	}
	
	/**
	 * 處理檔案
	 */
	@Override
	protected void doProcess() {
		try {
			for (N1Code code : N1Code.values()) {
				IN1_ProcessController controller = code.getController();
				controller.proFiles();
			}
		} catch (final Exception e) {
			throw new ApBusinessException("N1ProcessController doProcess 處理檔案異常", e);
		}
		
	}

}
