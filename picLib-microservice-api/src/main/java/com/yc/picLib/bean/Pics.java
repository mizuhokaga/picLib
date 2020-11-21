package com.yc.picLib.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "pics")
public class Pics {
    @Id
    private Integer pid;
    private String picpath;
    private String pname;

}
