package com.starylwu.medicalform.controller;

import com.starylwu.medicalform.dto.PersonalDTO;
import com.starylwu.medicalform.dto.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: Wuyulong
 * @Date: 2018/10/28 13:31
 * @Description:
 */
@RestController
@RequestMapping("/personal")
public class PersonalContoller {

    @GetMapping("/getPersonalInfo")
    public Result<PersonalDTO> getPersonalInfo(Long medicalNumber){
        PersonalDTO personalDTO = new PersonalDTO();
        personalDTO.setId(12345678L);
        personalDTO.setName("张少青");
        personalDTO.setMedicalNumber(medicalNumber);
        personalDTO.setMedicalDate(new Date());
        personalDTO.setSex("男");
        personalDTO.setAge(24);
        personalDTO.setNation("汉族");
        personalDTO.setJob("工人");
        personalDTO.setMarriage("未婚");
        personalDTO.setAddress("河北省张家口市经开区沙岭子镇太师湾村观音庙街201号");
        return Result.success(personalDTO);
    }
}
