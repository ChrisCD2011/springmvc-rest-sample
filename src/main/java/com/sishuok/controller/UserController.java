package com.sishuok.controller;

import com.sishuok.dao.CompanyDao;
import com.sishuok.dao.CompanyDaoImp;
import com.sishuok.entity.Company;
import com.sishuok.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-12-19
 * <p>Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id) throws IOException{
        CompanyDao dao = new CompanyDaoImp();
        List<Company> list = dao.GetList();
        User user = new User();
        user.setId(id);
        switch (id){
            case 1:
                user.setName("杨娇龙");
                break;
            case 2:
                user.setName("许兵");
                break;
            case 3:
                user.setName("何广深");
                break;
            default:
                break;
        }

        return user;
    }
}
