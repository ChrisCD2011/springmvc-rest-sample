package com.sishuok.dao;

import com.sishuok.entity.Company;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Chris on 2016/4/23.
 */
public class CompanyDaoImp implements CompanyDao {
    @SuppressWarnings("unchecked")
    public List<Company> GetList() {
        SqlSession session = SessionFactoryUtil.getSqlSessionFactory().openSession();
        List<Company> list = session.selectList("com.sishuok.map.CompanyMap.getList");
        session.close();
        return list;
    }

    public Company GetByCode(String code) {
        SqlSession session = SessionFactoryUtil.getSqlSessionFactory().openSession();
        Company company = session.selectOne("com.sishuok.map.CompanyMap.getCompany",code);
        return company;
    }
}
