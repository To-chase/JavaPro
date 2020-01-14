package com.day08.day08;

import com.day08.day08.til8.Buyer;
import com.day08.day08.til8.Lecturer;
import com.day08.day08.til8.Maintainer;
import com.day08.day08.til8.Tutor;

public class Test8 {
    public static void main(String[] args){
        Lecturer l=new Lecturer("666","傅红雪");
        l.word();
        Tutor t=new Tutor("668","顾棋");
        t.word();
        Maintainer m=new Maintainer("686","庖丁");
        m.word();
        Buyer b=new Buyer("888","景甜");
        b.word();
    }
}
