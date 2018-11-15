package com.sunuping.sunupcrm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 商品
 */
@Entity
@Table(name = "u_commodity")
public class Commodity implements Serializable {

    private static final long serialVersionUID = 8181033781180492724L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    /**
     * 编号
     */
    @Column(name = "serial_number")
    private String serialNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "info")
    private String info;
    @Column(name = "number")
    private long number;
    @Column(name = "price")
    private double price;
    /**
     * 规格
     */
    @Column(name = "specification")
    private String specification;
    /**
     * 效期
     */
    @Column(name = "validity_period")
    private Date validityPeriod;
    /**
     * 批号
     */
    @Column(name = "lot_number")
    private String lotNumber;
    /**
     * 录入时间
     */
    @Column(name = "entry_time")
    private Timestamp entryTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Date getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Date validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }
}
