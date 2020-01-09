package com.altay.altayspringboot.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity implements Serializable {

    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name="created_by",length = 100,insertable = false,updatable = false)
    private String createdBy;
    @Column(name="updated_at" )
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name="created_By",length = 100)
    private String updatedBy;
    @Column(name="status")
    private Boolean status;
}
