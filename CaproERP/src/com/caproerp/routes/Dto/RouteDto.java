/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caproerp.routes.Dto;

import com.caproerp.config.hibernate.NewHibernateUtil;
import com.caproerp.model.CaproErpRoutes;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class RouteDto {
    public static List<CaproErpRoutes> getRouteList() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CaproErpRoutes> cq = cb.createQuery(CaproErpRoutes.class);
        Root<CaproErpRoutes> root = cq.from(CaproErpRoutes.class);
        cq.select(root);

        List<CaproErpRoutes> route = session.createQuery(cq).getResultList();

        for (CaproErpRoutes b : route) {
            System.out.println("here route"+b.getRouteName());
        }

        session.getTransaction().commit();
        session.close();
        return route;
    }
 
}
