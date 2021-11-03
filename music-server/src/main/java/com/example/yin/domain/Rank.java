package com.example.yin.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Rank implements Serializable {

    private Long id;

    private Long songListId;

    private Long consumerId;

    private Integer score;

}
