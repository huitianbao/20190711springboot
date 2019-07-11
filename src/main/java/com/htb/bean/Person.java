package com.htb.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:  映射到bean中
 * @author: htb
 * @createDate: 2019/7/11
 * @version: 1.0
 */
@Data
@ToString
@Repository
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Dog dog;
    private Map<String,Object> map;
    private List<Object> list;

}
