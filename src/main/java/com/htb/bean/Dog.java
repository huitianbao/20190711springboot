package com.htb.bean;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/7/11
 * @version: 1.0
 */
@Data
@Repository
public class Dog {
    private String name;
    private Integer age;

}
