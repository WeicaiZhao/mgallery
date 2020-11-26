package com.imooc.mgallery.utils;

import com.imooc.mgallery.entity.Painting;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
import java.net.URLDecoder;


public class XmlDataSource {
    //use static keyword to make sure it is unique
    private static List <Painting> data = new ArrayList();
    private static String dataFile;

    static {
        // get painting.xml full path
        dataFile = XmlDataSource.class.getResource("/painting.xml").getPath();
        URLDecoder decoder = new URLDecoder();
        try {
            decoder.decode(dataFile, "UTF-8");
            System.out.println(dataFile);
            //use Dom4j to analyze XML
            SAXReader reader = new SAXReader();
            Document document = reader.read(dataFile);
            List<Node> nodes = document.selectNodes("/root/painting");

            for(Node node: nodes){
                Element element = (Element)node;
                String id = element.attributeValue("id");
                String pname = element.elementText("pname");
                Painting painting = new Painting();
                painting.setId(Integer.parseInt(id));
                painting.setPname(pname);
                painting.setCategroy(Integer.parseInt(element.elementText("category")));
                painting.setPrice(Integer.parseInt(element.elementText("price")));
                painting.setPreview(element.elementText("preview"));
                painting.setDescription(element.elementText("description"));
                data.add(painting);
//                System.out.println(id + ":" + pname);
            }


        } catch (UnsupportedEncodingException | DocumentException e) {
            e.printStackTrace();
        }
    }

    public static List<Painting> getRawDta(){
        return data;
    }

    public static void main (String[] args) {
//        new XmlDataSource();
        List<Painting> ps = XmlDataSource.getRawDta();
        System.out.println(ps);
    }

}
