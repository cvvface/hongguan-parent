package com.hg.servicebussiness.mapper;

import com.hg.servicebussiness.entity.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 品牌映射Mapper接口
 *
 * Created by jiangfan
 * 2018/8/20 14:27
 */
@Repository
public interface BrandMapper {

    /**
     * 查询所有品牌
     *
     * @return List<Brand>
     */
    @Select("SELECT id, name, logo, initials FROM brand")
    List<Brand> queryAllBrands();

    /**
     * 根据id查询单个品牌
     *
     * @param id
     * @return List<Brand>
     */
    @Select("SELECT id, name, logo, initials FROM brand WHERE id = #{id}")
    List<Brand> queryBrandLike(Long id);

    /**
     * 更新单个品牌
     *
     * @param brand
     */
    @Update("UPDATE brand SET name = #{name}, logo = #{logo}, initials = #{initials} WHERE id = #{id}")
    void updateBrand(Brand brand);

    /**
     * 删除单个品牌
     *
     * @param id
     */
    @Delete("DELETE FROM brand WHERE id = #{id}")
    void deleteBrand(Long id);

    /**
     * 添加品牌
     *
     * @param brand
     */
    @Insert("INSERT INTO brand(name, logo, initials) VALUES(#{name}, #{logo}, #{initials})")
    void addBrand(Brand brand);
}
