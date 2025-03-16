/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nglhongphuong.hibernatebuoi2;

import com.nglhongphuong.repositories.impl.CategoryRepositoryImpl;
import com.nglhongphuong.repositories.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateBuoi2 {

    public static void main(String[] args) {
       CategoryRepositoryImpl s = new CategoryRepositoryImpl();
       s.getCates().forEach(c -> System.out.println(c.getName()));
       ProductRepositoryImpl s2 = new ProductRepositoryImpl();
       Map<String, String> params = new HashMap<>();
       params.put("sort","");
       
       s2.getProducts(params).forEach(p-> System.out.printf("%d - %s: %.1f\n", p.getId(), p.getName(), p.getPrice()));
       
       
    }
}
