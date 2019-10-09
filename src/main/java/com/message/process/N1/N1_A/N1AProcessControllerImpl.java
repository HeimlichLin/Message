package com.message.process.N1.N1_A;

import com.message.process.N1.IN1_ProcessController;

/**
 * N1_A自主訊息處理檔案控制器
 * @author 6284
 *
 */
public class N1AProcessControllerImpl implements IN1_ProcessController {

	private transient N1AProcessServiceImpl service = new N1AProcessServiceImpl();

	public void proFiles() {
		this.service.proFiles();
	}

}
