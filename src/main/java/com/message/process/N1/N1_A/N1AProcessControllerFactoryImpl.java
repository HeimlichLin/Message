package com.message.process.N1.N1_A;

/**
 * N1AProcessControllerFactory
 * 
 * @author 6284
 *
 */
public class N1AProcessControllerFactoryImpl {

	private static N1AProcessControllerImpl controller;

	public static N1AProcessControllerImpl get() {
		if (N1AProcessControllerFactoryImpl.controller == null) {
			N1AProcessControllerFactoryImpl.controller = new N1AProcessControllerImpl();
		}
		return N1AProcessControllerFactoryImpl.controller;
	}

}
