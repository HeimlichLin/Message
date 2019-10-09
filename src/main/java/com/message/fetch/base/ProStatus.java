package com.message.fetch.base;

import java.io.File;

import com.message.common.code.DownloadMedidata;

/**
 * 檔案處理狀況
 * @author 6284
 *
 */
public enum ProStatus {
	
	FINISH {
		@Override
		void move(final DownloadMedidata medidata, final File file) {
////		final File flgFile = new File(file.getParent(), file.getName() + ".flg");
			final File flgFile = new File(file.getParent(), file.getName());
			final File moveFile = new File(medidata.getFinishPath(), file.getName());
			file.renameTo(moveFile);
			flgFile.delete();
		}
	}, //
	
	FAIL {
		@Override
		void move(final DownloadMedidata medidate, final File file) {
////		final File flgFile = new File(file.getParent(), file.getName() + ".flg");
			final File flgFile = new File(file.getParent(), file.getName());
			final File moveFile = new File(medidate.getFailPath(), file.getName());
			file.renameTo(moveFile);
			flgFile.delete();
		}
	} //
	
	;
	
	void move(final DownloadMedidata category, final File f) {
		
	}

}
