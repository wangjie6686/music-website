package com.example.yin.domain;

import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@Data
@ToString
public class Collect {
    private Integer id;

    private Integer userId;

    private Byte type;

    private Integer songId;

    private Integer songListId;

    private Date createTime;
}
