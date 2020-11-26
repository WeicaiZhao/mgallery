package com.imooc.mgallery.service;

import com.imooc.mgallery.dao.PaintingDao;
import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.utils.PageModel;

import java.util.List;

public class PaintingService {
    private PaintingDao paintingDao = new PaintingDao();
    public PageModel pagination(int page, int rows){
        if (rows ==0){
            throw new RuntimeException("invalid rows paras");
        }
        return paintingDao.pagination(page,rows);
    }

    //test
    public static void main (String[] args) {
        PaintingService paintingService = new PaintingService();
        PageModel pageModel = paintingService.pagination(1,5);
        List<Painting> paintingList = pageModel.getPageData();
        for(Painting painting: paintingList){
            System.out.println(painting.getPname());
        }
    }
}
