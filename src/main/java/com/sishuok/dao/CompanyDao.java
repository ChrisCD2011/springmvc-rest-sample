package com.sishuok.dao;

import com.sishuok.entity.Company;

import java.io.IOException;
import java.util.List;

/**
 * Created by Chris on 2016/4/23.
 */
public interface CompanyDao {
    public List<Company> GetList() throws IOException;
    public Company GetByCode(String code) throws IOException;
}
