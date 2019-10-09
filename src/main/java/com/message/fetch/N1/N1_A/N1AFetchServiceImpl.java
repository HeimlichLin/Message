package com.message.fetch.N1.N1_A;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import com.message.common.exception.ApBusinessException;
import com.message.common.utils.TextMapper;
import com.message.fetch.N1.N1FetchDTO;
import com.message.fetch.N1.N1FetchService;

/**
 * N1_A自主訊息寫入待處理紀錄服務實作
 * @author 6284
 *
 */
public class N1AFetchServiceImpl implements N1FetchService<N1AFetchItemDTO>, TextMapper<N1AFetchItemDTO> {

	//TODO
	@Override
	public void proFile(N1FetchDTO<N1AFetchItemDTO> n1FetchDTO) {
		
	}
	
	/**
	 * 文字轉型
	 */
	@Override
	public N1AFetchItemDTO toVo(final String text) {
		byte[] strByte;		
		try {
			strByte = text.getBytes(N1AFetchItem.getCharset());
			final String t1 = new String(Arrays.copyOfRange(strByte, N1AFetchItem.T1.getBeginIndex(), N1AFetchItem.T1.getLength()), N1AFetchItem.getCharset()).trim();
			final String bfNo = new String(Arrays.copyOfRange(strByte, N1AFetchItem.BFNO.getBeginIndex(), N1AFetchItem.BFNO.getLength()), N1AFetchItem.getCharset()).trim();
			final String refbillno = new String(Arrays.copyOfRange(strByte, N1AFetchItem.REFBILLNO.getBeginIndex(), N1AFetchItem.REFBILLNO.getLength()), N1AFetchItem.getCharset()).trim();
			final String item = new String(Arrays.copyOfRange(strByte, N1AFetchItem.ITEM.getBeginIndex(), N1AFetchItem.ITEM.getLength()), N1AFetchItem.getCharset()).trim();
			final String prdtNo = new String(Arrays.copyOfRange(strByte, N1AFetchItem.PRDTNO.getBeginIndex(), N1AFetchItem.PRDTNO.getLength()), N1AFetchItem.getCharset()).trim();
			final String strPost = new String(Arrays.copyOfRange(strByte, N1AFetchItem.STRPOST.getBeginIndex(), N1AFetchItem.STRPOST.getLength()), N1AFetchItem.getCharset()).trim();
			final String declNo = new String(Arrays.copyOfRange(strByte, N1AFetchItem.DECLNO.getBeginIndex(), N1AFetchItem.DECLNO.getLength()), N1AFetchItem.getCharset()).trim();
			final String declType = new String(Arrays.copyOfRange(strByte, N1AFetchItem.DECLTYPE.getBeginIndex(), N1AFetchItem.DECLTYPE.getLength()), N1AFetchItem.getCharset()).trim();
			final String itemNo = new String(Arrays.copyOfRange(strByte, N1AFetchItem.ITEMNO.getBeginIndex(), N1AFetchItem.ITEMNO.getLength()), N1AFetchItem.getCharset()).trim();
			final String extendDoc = new String(Arrays.copyOfRange(strByte, N1AFetchItem.EXTENDDOC.getBeginIndex(), N1AFetchItem.EXTENDDOC.getLength()), N1AFetchItem.getCharset()).trim();
			final String extendDate = new String(Arrays.copyOfRange(strByte, N1AFetchItem.EXTENDDATE.getBeginIndex(), N1AFetchItem.EXTENDDATE.getLength()), N1AFetchItem.getCharset()).trim();
			final N1AFetchItemDTO dto = new N1AFetchItemDTO();
			dto.setT1(t1);
			dto.setBfNo(bfNo);
			dto.setRefbillno(refbillno);
			dto.setItem(item);
			dto.setPrdtNo(prdtNo);
			dto.setStrPost(strPost);
			dto.setDeclNo(declNo);
			dto.setDeclType(declType);
			dto.setItemNo(itemNo);
			dto.setExtendDoc(extendDoc);
			dto.setExtendDate(extendDate);
			dto.setText(text);
			return dto;
		} catch (UnsupportedEncodingException e) {
			throw new ApBusinessException("N1AFetchServiceImpl toVo 解析錯誤檔案內容異常", e);
		}
	}

}
