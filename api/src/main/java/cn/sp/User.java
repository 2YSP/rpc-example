package cn.sp;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -4057058673874627457L;
    private Long id;
    private String name;
    private Integer gender;
    private String webSite;

    public User(Long id, String name, Integer gender, String webSite) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.webSite = webSite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
