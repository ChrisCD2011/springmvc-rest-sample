package com.sishuok.dao;

import com.sishuok.entity.Company;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Chris on 2016/4/23.
 */
public class CompanyDaoImp implements CompanyDao {
    @SuppressWarnings("unchecked")
    public List<Company> GetList(){
        SqlSession session = SessionFactoryUtil.getSession();
        List<Company> list = session.selectList("com.sishuok.map.CompanyMap.getList");
        SessionFactoryUtil.closeSession();
        return list;
    }

    public Company GetByCode(String code){
        SqlSession session = SessionFactoryUtil.getSession();
        List<Company> list = session.selectList("com.sishuok.map.CompanyMap.getCompany",code);
        SessionFactoryUtil.closeSession();
        if(list == null || list.size() == 0) return null;
        else{
            return list.get(0);
        }
    }
}
