package com.message.process.N1;

import java.io.Serializable;

import com.message.common.utils.YYYYMMDDUtils;

public class N1ProcessDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String executeTime = YYYYMMDDUtils.getText();
	
	public String getExecudeTime() {
		return executeTime;
	}
	
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

}
