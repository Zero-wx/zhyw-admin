package com.lumlord.zhyw.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lumlord.zhyw.bean.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2023/5/8
 *
 * @author huangwx
 * Description:
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
