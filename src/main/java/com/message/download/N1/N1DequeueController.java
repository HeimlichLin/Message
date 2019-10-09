package com.message.download.N1;

/**
 * N1自主訊息接收Controller
 * @author 6284
 *
 */
public class N1DequeueController {

	private N1DequeueService service = new N1DequeueServiceImpl();
	private N1DequeueDTO dto = new N1DequeueDTO();
	
	public static void main(String[] args) {
		N1DequeueController n1DequeueController = new N1DequeueController();
		n1DequeueController.doDownLoad();
	}
	
	/**
	 * DEQ_QUE
	 */
	public void doDownLoad() {
		this.service.download(this.dto);
	}
	
}
