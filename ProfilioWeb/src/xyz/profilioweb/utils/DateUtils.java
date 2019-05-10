package xyz.profilioweb.utils;

import java.sql.Date;
public class DateUtils {
	public Date convertToSqlDate(String date){
		return Date.valueOf(date);
	}
}
