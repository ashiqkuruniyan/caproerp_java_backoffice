/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.branch.Dto;

import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpExpenses;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author DELL
 */
public class ExpensesDto {
     public static List<CaproErpExpenses> getProductList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpExpenses> cq = cb.createQuery(CaproErpExpenses.class);
        Root<CaproErpExpenses> root = cq.from(CaproErpExpenses.class);
        cq.select(root);

        List<CaproErpExpenses> expenses = session.createQuery(cq).getResultList();

        for (CaproErpExpenses e : expenses) {
            System.out.println("here expenses"+e.getExpenseCode());
        }

        session.getTransaction().commit();
        session.close();
        return expenses;
    }
}
