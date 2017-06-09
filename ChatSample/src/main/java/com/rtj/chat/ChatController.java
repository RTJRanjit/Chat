package com.rtj.chat;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

@Controller
@RequestMapping(value = "/sample")
public class ChatController {
	static MessageResponse response = null;
	
	static Map context = new HashMap();
	
	@RequestMapping(value = "/chat", method = RequestMethod.POST)
	public static @ResponseBody String chat(@RequestParam(value="inp") String input) {
		System.out.println(input);
	
	
		response = Conversion.conversationAPI(input,context); 
	//	System.out.println("Watson Response:"+ response.getText().get(0));
		context = response.getContext();
		
		return response.getText().get(0);
	}
	
	
	
	

}
