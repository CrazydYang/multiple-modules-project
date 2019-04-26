package com.hacker.openbusiness.utils;

import org.springframework.beans.BeanUtils;

/**
 * Created by hacker on 2019/4/26 0026-上午 1:49
 *
 * @desc
 */
public class BeansUtils {

    public static void copyProperties(Object source, Object target){
        BeanUtils.copyProperties(source, target);
    }

}
