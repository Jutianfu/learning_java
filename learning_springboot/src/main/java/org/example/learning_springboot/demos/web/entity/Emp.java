package org.example.learning_springboot.demos.web.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Schema(name = "Employee", description = "$!{table.comment}")
public class Emp {
    @ExcelProperty("ID")
    @Schema(description = "ID")
    private Integer id;
    @ExcelProperty("用户名")
    @Schema(description = "用户名")
    private String username;
}
