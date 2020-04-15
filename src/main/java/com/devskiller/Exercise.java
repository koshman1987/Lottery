package com.devskiller;

import java.util.*;

public class Exercise {
    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates){
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       List<Integer> result = new ArrayList<>();

       for(Integer temp : integers){
           if (!map.containsKey(temp)) {
               map.put(temp, 1);
           } else {
               map.put(temp, map.get(temp) + 1);
           }
       }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() ==  numberOfDuplicates && entry.getKey() != null){
                result.add(entry.getKey());
            }

        }
        return result;
    }
}