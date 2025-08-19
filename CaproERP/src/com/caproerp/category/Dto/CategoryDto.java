/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.category.Dto;

import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpCategory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class CategoryDto {
    public static List<CaproErpCategory> getCategoryList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpCategory> cq = cb.createQuery(CaproErpCategory.class);
        Root<CaproErpCategory> root = cq.from(CaproErpCategory.class);
        cq.select(root);

        List<CaproErpCategory> category = session.createQuery(cq).getResultList();

        for (CaproErpCategory b : category) {
            System.out.println("here category"+b.getCategoryName());
        }

        session.getTransaction().commit();
        session.close();
        return category;
    }
}
