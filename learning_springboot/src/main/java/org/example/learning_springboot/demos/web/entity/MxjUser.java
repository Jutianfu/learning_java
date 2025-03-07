package org.example.learning_springboot.demos.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author 26523
 */
@Data
@TableName(value = "mxj_user")
public class MxjUser {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @Schema(description = "用户名")
    private String name;

}
