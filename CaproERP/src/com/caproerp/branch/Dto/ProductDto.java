/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.branch.Dto;

import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpProducts;
import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
/**
 *
 * @author Hima
 */
public class ProductDto {
      public static List<CaproErpProducts> getProductList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpProducts> cq = cb.createQuery(CaproErpProducts.class);
        Root<CaproErpProducts> root = cq.from(CaproErpProducts.class);
        cq.select(root);

        List<CaproErpProducts> products = session.createQuery(cq).getResultList();

        for (CaproErpProducts p : products) {
            System.out.println("here product"+p.getProductName());
        }

        session.getTransaction().commit();
        session.close();
        return products;
    }
}
