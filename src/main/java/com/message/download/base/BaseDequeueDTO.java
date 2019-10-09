package com.message.download.base;

import com.message.common.code.DownloadMedidata;

public class BaseDequeueDTO {

	final DownloadMedidata medidata;

	public BaseDequeueDTO(final DownloadMedidata medidata) {
		super();
		this.medidata = medidata;
	}

	public DownloadMedidata getMedidata() {
		return this.medidata;
	}

}
