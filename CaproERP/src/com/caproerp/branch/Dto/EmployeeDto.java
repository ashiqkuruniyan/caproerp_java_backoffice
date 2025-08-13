/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.branch.Dto;
import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpEmployees;

import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
/**
 *
 * @author DELL
 */
public class EmployeeDto {
     public static List<CaproErpEmployees> getProductList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpEmployees> cq = cb.createQuery(CaproErpEmployees.class);
        Root<CaproErpEmployees> root = cq.from(CaproErpEmployees.class);
        cq.select(root);

        List<CaproErpEmployees> employees = session.createQuery(cq).getResultList();

        for (CaproErpEmployees e : employees) {
            System.out.println("here product"+e.getEmployeeName());
        }

        session.getTransaction().commit();
        session.close();
        return employees;
    }
}
