package com.example.yin.domain;

import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@ToString
public class SongList {

    private Integer id;

    private String title;

    private String pic;

    private String style;

    private String introduction;

}
