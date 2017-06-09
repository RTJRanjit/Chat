package com.rtj.chat;

import java.util.Map;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public class Conversion {

	public static MessageResponse conversationAPI(String input,Map context){
		
		
		
		 ConversationService service = new ConversationService("2017-06-09");
		service.setUsernameAndPassword("2b940d46-7270-46c3-aee2-a5d474c1830e", "CkbtWNhHiS6y");
		MessageRequest newMessage = new MessageRequest.Builder()
		.inputText(input).context(context).build();
		String workspaceId = "2d09e964-b0d8-47fa-a797-ef5011808bbe";
		MessageResponse response = service.message(workspaceId, newMessage).execute();
	//	System.out.println("response "+response);
		return response;
		} 
	

}
