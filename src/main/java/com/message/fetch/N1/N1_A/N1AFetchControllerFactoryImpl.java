package com.message.fetch.N1.N1_A;

/**
 * N1AFetchControllerFactory
 * 
 * @author 6284
 *
 */
public class N1AFetchControllerFactoryImpl {

	private static N1AFetchControllerImpl controller;

	public static synchronized N1AFetchControllerImpl get() {
		if (N1AFetchControllerFactoryImpl.controller == null) {
			N1AFetchControllerFactoryImpl.controller = new N1AFetchControllerImpl();
		}
		return N1AFetchControllerFactoryImpl.controller;
	}

}
