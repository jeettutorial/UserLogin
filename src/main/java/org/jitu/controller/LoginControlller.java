package org.jitu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginControlller
{
        @ResponseBody
	    @RequestMapping("/hh")
		public String hello()
		{
			return "Ready to Go...Yahoo";
		}
}
