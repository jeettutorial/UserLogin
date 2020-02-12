package org.jitu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



//Login Controller Created By Jitendra Kumar Kewat
//Date 11-2-2020

@Controller
public class LoginControlller
{
        @ResponseBody
	    @RequestMapping("/hh")
		public String hello()
		{
			return "Ready to Go...Bro";
		}
        
        
        @RequestMapping("/welcome1")
        public String Welcome()
        {
        	return "welcomepage";
        }
        
}
