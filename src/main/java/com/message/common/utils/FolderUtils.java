package com.message.common.utils;

import java.io.File;

public class FolderUtils {
	
	public static void createFolders(String... paths) {
		for (String path : paths) {
			File file = new File(path);
			file.mkdirs();
			file.setExecutable(true, false);
			file.setReadable(true, false);
			file.setWritable(true, false);
		}
	}

	public static void createFolders(File... files) {
		for (File file : files) {
			file.mkdirs();
			file.setExecutable(true, false);
			file.setReadable(true, false);
			file.setWritable(true, false);
		}
	}

}
