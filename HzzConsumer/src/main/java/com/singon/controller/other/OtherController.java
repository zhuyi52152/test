/**
 * 
 */
package com.singon.controller.other;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.singon.controller.ResultMsg;
import com.singon.model.other.TestOther;
import com.singon.service.other.OtherService;

/**
 * @author cavly
 *
 */
@Controller
@RequestMapping("/other")
public class OtherController {

	@Autowired
	private OtherService otherService;
	
    @RequestMapping(value="/otherList", method=RequestMethod.GET)    
	public String getOthers(HttpServletRequest request,Model model){
		
    	List<TestOther> otherList = this.otherService.getOthers();
    	model.addAttribute("otherList", otherList);
    	return "asdfasdf";
	}
	
    @RequestMapping(value="/getOther") 
	public ResultMsg getOhterUser(int id){
    	
    	ResultMsg resultMsg = new ResultMsg();
		TestOther testOther = this.otherService.getOtherUser(id);
		
		resultMsg.setResultObj(testOther);
		
		return resultMsg;
	}
	
	
    @RequestMapping("/addOther")    
    public String addUser(HttpServletRequest request,Model model){    
       
    	TestOther other = new TestOther();    
        other.setOtherCode(String.valueOf(request.getParameter("code")));    
        other.setOtherName(String.valueOf(request.getParameter("name")));    
        other.setOtherAge(String.valueOf(request.getParameter("age")));    
        this.otherService.addOther(other);    
        return "redirect:/user/userList";    
    }   
	
}
