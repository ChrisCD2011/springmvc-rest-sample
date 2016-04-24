package com.sishuok.dao;

import com.sishuok.entity.Company;

import java.util.List;

/**
 * Created by Chris on 2016/4/23.
 */
public interface CompanyDao {
    public List<Company> GetList();
    public Company GetByCode(String code);
}
