package com.message.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.message.common.exception.ApBusinessException;

public class YYYYMMDDUtils {
	
	protected static final SimpleDateFormat SDF = new SimpleDateFormat(
			"yyyyMMdd");

	public static String getText(Date date) {
		return SDF.format(date);
	}

	public static String getText() {
		return getText(new Date());
	}
	
	
	public static Date parse(String yyyyMMdd) {
		try {
			return SDF.parse(yyyyMMdd);
		} catch (ParseException e) {
			throw new ApBusinessException("日期格式錯誤:" + yyyyMMdd);
		}
	}
	
	public static boolean isDate(String date) {
        String reg = "^\\d{8}$";
        if( date == null || date.equals("") || !date.matches(reg) ) {
        	return false;
        }
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 6));
        int day = Integer.parseInt(date.substring(6, 8));
        if( year < 1 || month < 1 || month > 12 || day < 1 || day > 31 ) {
            return false;
        } else if( ( month == 2 && day > 29 ) || ( ( month == 4 || month == 6 || month == 9 || month == 11 ) && ( day > 30 ) ) ) {
            return false;
        } else if( month == 2 ) {
            if( year % 4 != 0  && day > 28 ) {
                return false;
            }
        }
        return true;
    }

}
