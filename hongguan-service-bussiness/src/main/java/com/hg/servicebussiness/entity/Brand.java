package com.hg.servicebussiness.entity;



import java.io.Serializable;

/**
 * Created by jiangfan
 * 2018/8/20 14:23
 */
public class Brand implements Serializable {

    /**
     * 序列化ID
     */
    private static final Long serialVersionUID = 1L;

    /**
     * 品牌ID
     */
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌logo
     */
    private String logo;

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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	/**
     * 品牌首字母
     */
    private String initials;

}
