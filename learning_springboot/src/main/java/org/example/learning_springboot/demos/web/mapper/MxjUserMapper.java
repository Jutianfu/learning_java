package org.example.learning_springboot.demos.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.learning_springboot.demos.web.entity.MxjUser;
@Mapper
public interface MxjUserMapper extends BaseMapper<MxjUser> {
}
