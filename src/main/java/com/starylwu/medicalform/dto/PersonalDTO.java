package com.starylwu.medicalform.dto;

import java.util.Date;

/**
 * @Auther: Wuyulong
 * @Date: 2018/10/28 13:32
 * @Description: 个人信息封装
 */
public class PersonalDTO {

    private Long id;

    private String name;

    private Long medicalNumber;

    private Date medicalDate;

    private String sex;

    private Integer age;

    private String nation;

    private String job;

    private String marriage;

    private String address;

    public PersonalDTO(Long id, String name, Long medicalNumber, Date medicalDate, String sex, Integer age, String nation, String job, String marriage, String address) {
        this.id = id;
        this.name = name;
        this.medicalNumber = medicalNumber;
        this.medicalDate = medicalDate;
        this.sex = sex;
        this.age = age;
        this.nation = nation;
        this.job = job;
        this.marriage = marriage;
        this.address = address;
    }

    public PersonalDTO() {
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

    public Long getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(Long medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public Date getMedicalDate() {
        return medicalDate;
    }

    public void setMedicalDate(Date medicalDate) {
        this.medicalDate = medicalDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonalDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicalNumber=" + medicalNumber +
                ", medicalDate=" + medicalDate +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", job='" + job + '\'' +
                ", marriage='" + marriage + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
