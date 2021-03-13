package com.nowcoder.community.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.Map;
import java.util.UUID;

public class CommunityUtil {


    public static String generateUUID(){
        return UUID.randomUUID().toString().replace("-","");


    }

    public static String md5(String key){
        if (StringUtils.isBlank(key)) {
            return null;

        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

    public static String getJSONString(int code, String msg, Map<String,Object> map){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put(";msg",msg);
        if (map!=null) {
            for (String s : map.keySet()) {
                jsonObject.put(s,map.get(s));
            }
        }
        return jsonObject.toJSONString();
    }

    public static String getJSONString(int code,String msg){
        return getJSONString(code,msg,null);
    }
    public static String getJSONString(int code){
        return getJSONString(code,null,null);
    }
}