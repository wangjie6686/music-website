package com.example.yin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

@Data
@TableName("consumer")
public class Consumer extends Model<Consumer> {

    private static final long serialVersionUID =1l;

    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("sex")
    private Byte sex;

    @TableField("Phone_Num")
    private String Phone_Num;

    @TableField("Email")
    private String Email;


    @TableField("birth")
    private Date birth;

    @TableField("introduction")
    private String introduction;

    @TableField("location")
    private String location;

    @TableField("avator")
    private String avator;

    @TableField("Create_Time")
    private Date Create_Time;

    @TableField("Update_Time")
    private Date Update_Time;
}
