package com.niuxuewei.lucius.entity.po;

import java.util.Date;
import lombok.Data;

@Data
public class Gitlab {
    private Integer id;

    private Integer userId;

    private Integer gitlabId;

    private Date createDate;
}