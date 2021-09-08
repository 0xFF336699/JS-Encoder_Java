package com.lzq.dubboservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzq.api.dto.AccountResult;
import com.lzq.api.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：LZQ
 * @description：TODO
 * @date ：2021/8/23 14:49
 */
@Repository
public interface AccountResultMapper extends BaseMapper<AccountResult> {

    public List<AccountResult> getFollowList(AccountResult result);

    public List<AccountResult> getFanList(AccountResult result);

    Integer updateFavorites(AccountResult result);
}
