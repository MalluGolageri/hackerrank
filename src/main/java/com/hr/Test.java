package com.hr;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by golagem on 10/14/17.
 */
public class Test {
    public static void main(String[] args) {
        
    }


    private static String getUnsignedBitsAsString(long number){
        return Long.toBinaryString( number | 4294967296L ).substring(1); //4,294,967,296 == 4> 4294967291
    }


}

