package com.web.controller.page;

import com.alibaba.fastjson.JSON;
import com.sun.deploy.net.HttpResponse;
import com.web.controller.model.UsersModel;
import com.web.tool.ServiceTool;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/login")
@Controller
public class LoginController {
    @Resource
    private ServiceTool serviceTool;

    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }


    @ResponseBody
    @RequestMapping("/login")
    public String userLogin(UsersModel usersModel, HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        System.out.println(usersModel.getUserEmail());
        session.setAttribute("user","success");
        String returnData = JSON.toJSONString(session.getAttribute("user"));
        System.out.println(serviceTool.getIp(request));
        return returnData;
    }

    @ResponseBody
    @RequestMapping("/res")
    public String userRes(UsersModel usersModel,HttpServletRequest req,HttpServletResponse resp){
        String returnData = JSON.toJSONString("success");
        System.out.println(usersModel.getUserName());
        return returnData;
    }
}
