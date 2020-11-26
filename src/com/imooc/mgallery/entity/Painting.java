package com.imooc.mgallery.entity;

public class Painting { //JavaBean
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getCategroy() {
        return categroy;
    }

    public void setCategroy(Integer categroy) {
        this.categroy = categroy;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String pname;
    private Integer categroy;
    private Integer price;
    private String preview;
    private String description;
}
