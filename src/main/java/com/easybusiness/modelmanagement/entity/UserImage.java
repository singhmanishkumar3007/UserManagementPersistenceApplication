package com.easybusiness.modelmanagement.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;

@Entity
@Table(name = "USER_IMAGE")
public class UserImage implements Serializable {
    
    

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id()
    @Column(name = "MAPPING_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Lob
    @Column(name = "USER_IMG")
    private byte[] userImg;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "USER_ID")
    private User user;
    
    public UserImage() {
	super();
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

  
    @Lob
    public byte[] getUserImg() {
        return userImg;
    }

    public void setUserImg(byte[] userImg) {
        this.userImg = userImg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
	return "UserImage [id=" + id + ", userImg=" + userImg + ", user=" + user + "]";
    }

   

}
