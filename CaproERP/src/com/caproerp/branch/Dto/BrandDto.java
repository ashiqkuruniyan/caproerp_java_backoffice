/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.branch.Dto;
import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpBrands;

import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
/**
 *
 * @author DELL
 */
public class BrandDto {
    
    public static List<CaproErpBrands> getBranchList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpBrands> cq = cb.createQuery(CaproErpBrands.class);
        Root<CaproErpBrands> root = cq.from(CaproErpBrands.class);
        cq.select(root);

        List<CaproErpBrands> brands = session.createQuery(cq).getResultList();

        for (CaproErpBrands b : brands) {
            System.out.println("here brand"+b.getBrandName());
        }

        session.getTransaction().commit();
        session.close();
        return brands;
    }
}
