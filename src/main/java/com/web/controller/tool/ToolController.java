package com.web.controller.tool;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/tool")
public class ToolController {

    @RequestMapping("/session")
    @ResponseBody
    public String getSession(String sessionName, HttpServletResponse res, HttpServletRequest req){
        return JSON.toJSONString(req.getSession().getAttribute(sessionName));
    }

}
