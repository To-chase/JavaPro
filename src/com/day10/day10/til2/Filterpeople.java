package com.day10.day10.til2;

import java.util.List;

public class Filterpeople {
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void setUser(User user){
        if(user.getType()!=null){
            return;
        }else if(filter!=null){
            filter.filterUser(user);
            return;
        }else{
            user.setType("A");
        }
//        System.out.println(list.size());
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).getType()!=null){
////                return;
//            }else if(filter!=null){
//                return;
//            }else{
//                list.get(i).setType("A");
//            }




    }

}
