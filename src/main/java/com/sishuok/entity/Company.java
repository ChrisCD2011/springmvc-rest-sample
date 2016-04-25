package com.sishuok.entity;

import java.io.Serializable;

/**
 * Created by Chris on 2016/4/23.
 */
@SuppressWarnings("serial")
public class Company implements Serializable {
    private String companyCode;
    private String companyName;
    private String url;

    public Company(){

    }

    public Company(String companyCode, String companyName, String url){
        super();
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.url = url;
    }

    public String getCompanyCode(){
        return companyCode;
    }
    public void setCompanyCode(String companyCode){
        this.companyCode = companyCode;
    }

    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
}
