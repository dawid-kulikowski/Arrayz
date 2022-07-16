package application;

import java.util.HashMap;
import java.util.Map;

public class Mapz {


//    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
//
//
//    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
//    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
//    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}

    public Map<String,Integer> wordLen(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (String s:strings){
            map.put(s,s.length());
        }
        return map;
    }

//    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
//
//
//    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//    pairs(["man", "moon", "main"]) → {"m": "n"}
//    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}



    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s:strings) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "" );
        }
        return map;
    }
}
