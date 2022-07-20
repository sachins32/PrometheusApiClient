package com.sachin.PrometheusAPIClient.model;

public class Airlines {

    private int id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String head_quaters;
    private String website;
    private String established;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setHead_quaters(String head_quaters) {
        this.head_quaters = head_quaters;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setEstablished(String established) {
        this.established = established;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getLogo() {
        return logo;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getHead_quaters() {
        return head_quaters;
    }

    public String getWebsite() {
        return website;
    }

    public String getEstablished() {
        return established;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", logo='" + logo + '\'' +
                ", slogan='" + slogan + '\'' +
                ", head_quaters='" + head_quaters + '\'' +
                ", website='" + website + '\'' +
                ", established='" + established + '\'' +
                '}';
    }
}
