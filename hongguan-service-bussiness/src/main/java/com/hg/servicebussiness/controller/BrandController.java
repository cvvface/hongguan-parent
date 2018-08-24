package com.hg.servicebussiness.controller;

import com.hg.servicebussiness.entity.Brand;
import com.hg.servicebussiness.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jiangfan
 * 2018/8/20 15:31
 */
@RestController
public class BrandController {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 显示主页面
     *
     * @return mav
     */
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/index");
        return mav;
    }

    /**
     * 查询所有品牌
     *
     * @return List<Brand>
     */
    @GetMapping("/brands")
    public List<Brand> queryAllBrands() {
        List<Brand> brands = brandMapper.queryAllBrands();

        return brands;
    }

    /**
     * 根据id查询单个品牌
     *
     * @param id
     * @return
     */
    @GetMapping("/brands/{id}")
    public List<Brand> queryBrandLike(@PathVariable("id") Long id) {
        List<Brand> brands = brandMapper.queryBrandLike(id);

        return brands;
    }

    /**
     * 新增品牌
     *
     * @param name
     * @param logo
     * @param initials
     * @return
     */
    @PostMapping("/brands")
    public String addBrand(@RequestParam("name") String name,
                           @RequestParam("logo") String logo,
                           @RequestParam("initials") String initials) {
        Brand brand = new Brand();
        brand.setName(name);
        brand.setLogo(logo);
        brand.setInitials(initials);
        brandMapper.addBrand(brand);

        return "add ok";
    }

    /**
     * 更新品牌
     *
     * @param id
     * @param name
     * @param logo
     * @param initials
     * @return
     */
    @PutMapping("/brands/{id}")
    public Brand updateBrand(@PathVariable("id") Long id,
                             @RequestParam("name") String name,
                             @RequestParam("logo") String logo,
                             @RequestParam("initials") String initials) {
       Brand brand = new Brand();
       brand.setId(id);
       brand.setName(name);
       brand.setLogo(logo);
       brand.setInitials(initials);
       brandMapper.updateBrand(brand);

       return brand;
    }

    /**
     * 删除品牌
     *
     * @param id
     * @return
     */
    @DeleteMapping("/brands/{id}")
    public String deleteBrand(@PathVariable("id") Long id) {
        brandMapper.deleteBrand(id);

        return "delete ok";
    }
}
