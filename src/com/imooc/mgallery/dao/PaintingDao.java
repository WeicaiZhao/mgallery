package com.imooc.mgallery.dao;

import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.utils.PageModel;
import com.imooc.mgallery.utils.XmlDataSource;

import java.util.List;

public class PaintingDao {
    /**
     *
     * @param page :page number
     * @param rows : records in every page
     * @return PageModel: Divide pages objects
     */
    public PageModel pagination(int page, int rows){
        //Painting list objects data
        List<Painting> list = XmlDataSource.getRawDta();
        PageModel pageModel = new PageModel(list,page,rows);
        return pageModel;
    }
}
