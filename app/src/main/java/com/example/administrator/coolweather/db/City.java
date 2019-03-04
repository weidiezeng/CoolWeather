package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityname;
    private int cityCode;
    private int provinceId;//当前市所属省的id
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCityname(){
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
