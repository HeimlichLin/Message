package com.message.fetch.base;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import com.message.common.code.DownloadMedidata;

/**
 * N1萃取檔案內容
 * @author 6284
 *
 */
public abstract class BaseFetchController {
	
	private DownloadMedidata medidata;
	
	public BaseFetchController(final DownloadMedidata medidata) {
		this.medidata = medidata;
	}
	
	/**
	 * 執行
	 */	
	public void execute() {
		final List<File> files = this.getBKFiles();
		for (final File file : files) {
			ProStatus proStatus = ProStatus.FAIL;
			try {
				proStatus = this.proFiles(file);
				proStatus.move(this.medidata, file);
			} catch (final Exception e) {
				proStatus = ProStatus.FAIL;
				proStatus.move(this.medidata, file);
			}
		}
	}
	
	/**
	 * 檔案處理
	 * @param file
	 * @return
	 */
	abstract protected ProStatus proFiles(File file);
	
	/**
	 * 取得完成檔案
	 * @return
	 */
	private List<File> getBKFiles() {
		final FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(final File f) {
				if (!f.isFile()) {
					return false;
				}
				if (!f.getName().startsWith(BaseFetchController.this.medidata.getCateogry())) {
					return false;
				}
////			if (!f.getName().endsWith("flg")) {
////				return false;
////			}
				return true;
			}
		};
		
		final File fileDIR = new File(this.medidata.getPath());
        
		final File[] listFiles = fileDIR.listFiles(fileFilter);
		final List<File> files = new ArrayList<File>();
		for (final File file : listFiles) {
//		final File pFile = new File(file.getParent(), file.getName().replace(".flg", ""));
			final File pFile = new File(file.getParent(), file.getName());
			if (pFile.exists()) {
				files.add(pFile);
			}
		}
		return files;
	}

}
