package com.liveshow.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liveshow.backend.pojo.Favorite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteMapper extends BaseMapper<Favorite> {
}
