package com.lumlord.zhyw.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lumlord.zhyw.bean.entity.system.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2023/5/12
 *
 * @author huangwx
 * Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
