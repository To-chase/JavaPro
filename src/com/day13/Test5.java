package com.day13;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("amy1",45,99));
        list.add(new User("lulu",33,78));
        list.add(new User("luly",33,88));
        list.add(new User("李四",33,95));
//        Comparator  年龄降序，成绩升序
//        Collections.sort(list, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                int result=o2.getAge()-o1.getAge();
//                if(result==0){
//                    result=o1.getScore()-o2.getScore();
//                }
//                return result;
//            }
//        });

        Collections.sort(list,(a,b)->{
            int result=b.getAge()-a.getAge();
            if(result==0){
                result=a.getScore()- b.getScore();
            }
            return result;
        });
        list.stream().forEach(System.out::println);

    }
}
