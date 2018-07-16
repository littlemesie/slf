package cn.mesie.controller;

import cn.mesie.mapper.AdminMapper;
import cn.mesie.pojo.Admin;
import cn.mesie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 2018/7/13 11:31 PM
 *
 * @author: mesie
 */
@Controller
public class LoginController {

    //@Resource
    //AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(Model m){
        List<Admin> admin = adminService.findAll();
        for(Admin a : admin){
            System.out.println(a.getId() + "," + a.getName());
        }
        return "login/index";
    }
}
