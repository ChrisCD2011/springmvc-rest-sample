package com.sishuok.controller;

import com.sishuok.dao.CompanyDao;
import com.sishuok.dao.CompanyDaoImp;
import com.sishuok.entity.Company;
import com.sishuok.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
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

        logger.error("Test Error ");
        return user;
    }

    @RequestMapping(value = "/testCompany/{code}", method = RequestMethod.GET)
    public Company testCompany(@PathVariable("code") String code){
        CompanyDao dao = new CompanyDaoImp();
        List<Company> list = dao.GetList();
        Company company = dao.GetByCode(code);
        if(company == null && list.size() > 0) company = list.get(0);
        logger.info("Company Name is: " + company.getCompanyName());
        return company;
    }
}
