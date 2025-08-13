/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.branch.Dto;
import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpUnitTypes;
import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
/**
 *
 * @author DELL
 */
public class UnitTypesDto {
      public static List<CaproErpUnitTypes> getBranchList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpUnitTypes> cq = cb.createQuery(CaproErpUnitTypes.class);
        Root<CaproErpUnitTypes> root = cq.from(CaproErpUnitTypes.class);
        cq.select(root);

        List<CaproErpUnitTypes> unitTypes = session.createQuery(cq).getResultList();

        for (CaproErpUnitTypes u : unitTypes) {
            System.out.println("here brand"+u.getUnitTypeName());
        }

        session.getTransaction().commit();
        session.close();
        return unitTypes;
    }
}
