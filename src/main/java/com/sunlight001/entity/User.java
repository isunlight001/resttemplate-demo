package com.sunlight001.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * @author sunlight001
 */
public class User {
    private Long id;
    private String name;
    private Integer age;
}
