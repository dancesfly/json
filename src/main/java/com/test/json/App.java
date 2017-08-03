package com.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class App {
	public static void main(String[] args) {
		String s = "{\"name\":\"liuzhao\"}"; 
		JSONObject object = JSON.parseObject(s); 
		System.out.println(object.get("name"));
	}
}
