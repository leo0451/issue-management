package com.maslan.issuemanagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass //bütün tablolarda ortak olmasını sağlayan annatation
@Getter
@Setter
public class BaseEntity implements Serializable {

    @Column(name = "created_at")
    //saat dakika saniye ay yıl gün hepsi tutulru timestamp nasıl katıy edilecek onu belirtiriz
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "created_by", length = 100)
    private String createdBy;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "update_by", length = 100)
    private String updatedBy;
    @Column(name = "status")
    private Boolean status;

}
