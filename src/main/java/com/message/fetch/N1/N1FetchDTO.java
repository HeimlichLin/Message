package com.message.fetch.N1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class N1FetchDTO<PO> {
	
	private File file;
	private List<PO> n1FetchItemDTOs = new ArrayList<PO>();
	private PO nowSelectItemDTO;
	private String message;	
	int version; //版本
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public List<PO> getN1FetchItemDTOs() {
		return n1FetchItemDTOs;
	}

	public void setN1FetchItemDTOs(List<PO> n1FetchItemDTOs) {
		this.n1FetchItemDTOs = n1FetchItemDTOs;
	}

	public PO getNowSelectItemDTO() {
		return nowSelectItemDTO;
	}

	public void setNowSelectItemDTO(PO nowSelectItemDTO) {
		this.nowSelectItemDTO = nowSelectItemDTO;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getFileName() {
		return this.file.getName().substring(0, this.file.getName().indexOf(".af"));
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
