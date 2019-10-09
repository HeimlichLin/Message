package com.message.common.code;

import com.message.process.N1.IN1_ProcessController;
import com.message.process.N1.N1_A.N1AProcessControllerFactoryImpl;

/**
 * 訊息格式N1內的類別
 * @author 6284
 *
 */
public enum N1Code {
	
	N1_A("N1.A", N1AProcessControllerFactoryImpl.get()), // 負責處理的service
//	N1_B("N1.B", null) // 尚未定義
	;
	
	final String code;
	final String text;
	final IN1_ProcessController controller;
	
	private N1Code(String text, IN1_ProcessController controller) {
		this.code = name();
		this.text = text;
		this.controller = controller;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getText() {
		return text;
	}

	public IN1_ProcessController getController() {
		return controller;
	}

}
