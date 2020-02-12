package com.soft.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2020/2/12.
 */
public class MyConverter implements Converter<String, Date>{
    @Override
    public Date convert(String source) {
        if (source == null) {
            try {
                throw new Exception("运行时异常");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
