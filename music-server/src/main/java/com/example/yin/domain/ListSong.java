package com.example.yin.domain;

import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

@Data
@ToString
public class ListSong implements Serializable {

    private Integer id;

    private Integer songId;

    private Integer songListId;
}
