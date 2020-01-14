package com.day09.day09;

import com.day09.day09.til4.NewPhone;
import com.day09.day09.til4.OldPhone;

public class Test4 {
    public static void main(String[] args) {
        OldPhone oldPhone=new OldPhone();
         oldPhone.call();
         oldPhone.senfMessage9();
        NewPhone phone=new NewPhone();
        phone.call();
        phone.senfMessage9();
        phone.playGames();
    }

}
