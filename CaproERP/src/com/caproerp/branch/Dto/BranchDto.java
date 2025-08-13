/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.branch.Dto;


import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpBranches;
import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author PNG
 */
public class BranchDto {

    public static List<CaproErpBranches> getBranchList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpBranches> cq = cb.createQuery(CaproErpBranches.class);
        Root<CaproErpBranches> root = cq.from(CaproErpBranches.class);
        cq.select(root);

        List<CaproErpBranches> branches = session.createQuery(cq).getResultList();

        for (CaproErpBranches b : branches) {
            System.out.println("here branch"+b.getBranchName());
        }

        session.getTransaction().commit();
        session.close();
        return branches;
    }

}
