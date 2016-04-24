package com.sishuok.entity;

import java.io.Serializable;

/**
 * Created by Chris on 2016/4/23.
 */
@SuppressWarnings("serial")
public class Company implements Serializable {
    private String CompanyCode;
    private String CompanyName;
    private String Url;

    public Company(){

    }

    public Company(String companyCode, String companyName, String url){
        super();
        this.CompanyCode = companyCode;
        this.CompanyName = companyName;
        this.Url = url;
    }

    public String getCompanyCode(){
        return CompanyCode;
    }
    public void setCompanyCode(String companyCode){
        this.CompanyCode = companyCode;
    }

    public String getCompanyName(){
        return CompanyName;
    }
    public void setCompanyName(String companyName){
        this.CompanyName = companyName;
    }

    public String getUrl(){
        return Url;
    }
    public void setUrl(String url){
        this.Url = url;
    }
}
