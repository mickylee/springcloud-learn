package com.mickyli.springcloud.entity;



import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by liqian on 2017/6/7 0007.
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
