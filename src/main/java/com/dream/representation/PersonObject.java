package com.dream.representation;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PersonObject implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String name;
    private Integer sex;                     //null: 空, 0:男, 1:女
    private String sexName;
    private String phone;
    private String email;
    private String remarks;

    public String getSexName() {
        if (sex == null) return "-";
        else if (sex == 0) return "男";
        else if (sex == 1) return "女";
        else return "-";
    }
}
