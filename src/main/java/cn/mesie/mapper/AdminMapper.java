package cn.mesie.mapper;

import cn.mesie.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 2018/7/13 11:28 PM
 *
 * @author: mesie
 */
@Component
@Mapper
public interface AdminMapper {

    // 基于注解的和xml两种方式
    // @Select("select * from admin")
    List<Admin> findAll();
}
