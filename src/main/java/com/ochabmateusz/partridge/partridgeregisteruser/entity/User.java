package com.ochabmateusz.partridge.partridgeregisteruser.entity;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Document
public class User {

    @Id
    @GeneratedValue
    private String id;

    @Field(value = "userCore")
    private UserCore userCore;

    @Field(value = "confirmed")
    private boolean confirmed;


    @Field(value = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @CreatedDate
    @Field(value = "createdDate")
    private Date createdDate;


    //    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
    @Field(value = "modifiedDate")
    private Date modifiedDate;

    public User(UserCore userCore){

        this.userCore=userCore;
        this.confirmed=false;
        this.role=Role.USER;
        this.createdDate=new Date();
        this.modifiedDate=null;

    }
}
