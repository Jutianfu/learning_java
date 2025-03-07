package org.example.learning_springboot.demos.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.learning_springboot.demos.web.entity.MxjUser;
import org.example.learning_springboot.demos.web.mapper.MxjUserMapper;
import org.example.learning_springboot.demos.web.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<MxjUserMapper, MxjUser> implements TestService {
    @Override
    public String getTest() {
        return "test";
    }
}
