/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.examenbimestral;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class GeneradorCalificaciones1 {

    public static void main(String[] args) throws Exception{
        
        System.out.println("Probaremos todas las operaciones SQL");
        //Primer paso crear El SessionFactory
        
       SessionFactory factory = Evaluacion.getSessionFactory();
        
       //Obtenemos la apertura de seccion actual
               Session sesion = factory.openSession();
       //Creamos la transaccion
               Transaction tranza = sesion.beginTransaction();
            
               
               Apoyo2 u = new Apoyo2();
               u.setEmail("Petra@gmail.com");
               u.setNombre("Petra Godinez");
               u.setLogin("Petra1");
               u.setPassword("123");
               u.setCalificacion("5.8");
          
              /* Apoyo2 u = new Apoyo2();
               u.setEmail("Jose@gmail.com");
               u.setNombre("Jose Suarez");
               u.setLogin("Jose1");
               u.setPassword("321");
               u.setCalificacion("7.4");*/
               
               /* Apoyo2 u = new Apoyo2();
               u.setEmail("Roberta@gmail.com");
               u.setNombre("Roberta Valdez");
               u.setLogin("Roberta1");
               u.setPassword("456");
               u.setCalificacion("8.6");*/
               
               
               Apoyo daou = new Apoyo();
               daou.guardar(u);
               
           
    }
    
}