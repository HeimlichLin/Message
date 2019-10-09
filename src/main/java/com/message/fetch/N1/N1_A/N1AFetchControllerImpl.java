package com.message.fetch.N1.N1_A;

import java.io.File;

import com.message.fetch.N1.N1FetchDTO;

/**
 * N1_A自主訊息寫入待處理紀錄控制器
 * 
 * @author 6284
 *
 */
public class N1AFetchControllerImpl {

	private transient N1AFetchServiceImpl service = new N1AFetchServiceImpl();

	public void proFiles(File file) {
		N1FetchDTO<N1AFetchItemDTO> n1FetchDTO = new N1FetchDTO<N1AFetchItemDTO>();
		n1FetchDTO.setFile(file);
		this.service.proFile(n1FetchDTO);
	}

}
