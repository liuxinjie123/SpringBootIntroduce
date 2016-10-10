package com.dream.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Person implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String name;
    private Integer sex;
    private String phone;
    private String email;
    private String remarks;

}
