package com.springapp.mvc.formate;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class Data2StringFormater implements Formatter {
    final static String regex = "yyyy-MM-DD";

    @Override
    public Object parse(String s, Locale locale) throws ParseException {

        return null;
    }

    @Override
    public String print(Object o, Locale locale) {
        return null;
    }
}
