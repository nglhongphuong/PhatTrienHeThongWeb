/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nglhongphuong.repositories.impl;

import com.nglhongphuong.hibernatebuoi2.HibernateUtils;
import com.nglhongphuong.pojo.Category;
import com.nglhongphuong.pojo.OrderDetail;
import com.nglhongphuong.pojo.Product;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class StatsReponsitoryImpl {
    private List<Object[]> statsRevenueByProduct(){
         try (Session s = HibernateUtils.getFACTORY().openSession()) {
            CriteriaBuilder b = s.getCriteriaBuilder();
            CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
            Root root = q.from(OrderDetail.class);
            Join<OrderDetail, Product> join = root.join("productId",JoinType.RIGHT);
            
            
            return null;
        }
    }
}
