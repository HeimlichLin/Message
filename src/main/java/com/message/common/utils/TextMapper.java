package com.message.common.utils;

/**
 * 文字內容轉型
 * @author 6284
 *
 * @param <VO>
 */
public interface TextMapper<VO> {
	
	/**
	 * 根據text轉換成VO
	 * @param text
	 * @return
	 */
	VO toVo(String text);

}
