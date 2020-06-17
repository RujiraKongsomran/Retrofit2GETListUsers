package com.rujirakongsomran.retrofit2getlistusers.Model;

import java.util.List;

public class Users {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<Profile> data;
    private Ad ad;

    public Users() {
    }

    public Users(int page, int per_page, int total, int total_pages, List<Profile> data, Ad ad) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
        this.ad = ad;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<Profile> getData() {
        return data;
    }

    public void setData(List<Profile> data) {
        this.data = data;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
