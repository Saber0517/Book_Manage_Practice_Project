package com.springapp.mvc.controller.abandon;

import org.junit.Test;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
@Controller
public class ConversionFormatController {
    @Test
    public void test() {
        DefaultFormattingConversionService sfcs = new DefaultFormattingConversionService();
        Double d1 = sfcs.convert("12.12", Double.class);
        System.out.println("d1 ：" + d1);
        Date date = sfcs.convert("1992/05/17", Date.class);
        System.out.println("date: " + date);
//        FormattingConversionServiceFactoryBean
    }

    @NumberFormat(pattern = "##,###,00")
    public double salry;


}
