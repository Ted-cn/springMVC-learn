package com.cui.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换为日期
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s == null) {
            throw new RuntimeException("日期值不能为空！");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("日期格式化错误！");
        }
    }
}
