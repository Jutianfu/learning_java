package org.example.learning_springboot.demos.web.controller;

import org.example.learning_springboot.demos.web.entity.MxjUser;
import org.example.learning_springboot.demos.web.service.MxjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 26523
 */
@RestController
@RequestMapping("/mxj")
public class MxjUserController {
    @Autowired
    private MxjUserService userService;
    @GetMapping("")
    public List<MxjUser> getMxjUserList(){
        List<MxjUser> list = userService.list();
        MxjUser user =new MxjUser();
        return list;
    }
}
