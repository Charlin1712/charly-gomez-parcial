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
/**
 *
 * @author Dell
 */
public class Apoyo {
    
     static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    //
    public static void iniciarTodo()
    {
        //Bloque iniciañiza sesion accediendo al mapeado y poder hacer modificaciones
        factory = Evaluacion.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }
    public static void cerrarTodo()
    {
        tranza.commit();
        session.close();
    }
    //Constructor por defecto
    public Apoyo()
    {
        
    }
    
    //Creamos el insert
    public void guardar(Apoyo2 u)throws Exception
    {
    //Aqui poner el codigo de tu guardado
        
    //Despues invocas el metodo cerrar todo
         session.save(u);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Apoyo2 u)throws Exception
    {
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Apoyo2> buscarTodos()throws Exception
    {
        iniciarTodo();
        List<Apoyo2> usuarios = session.createCriteria(Apoyo2.class).list();
        cerrarTodo();
        return usuarios;
    }
    //Creamos el buscarPorID
    public Apoyo2 buscarPorId(Integer id)throws Exception
    {
        Apoyo2 u =(Apoyo2) session.createCriteria(Apoyo2.class).add(Restrictions.idEq(id)).uniqueResult();
         cerrarTodo();
        return u;
    }
    public void eliminar(Integer id)throws Exception{
        Apoyo2 u =(Apoyo2) session.createCriteria(Apoyo2.class).add(Restrictions.idEq(1)).uniqueResult();
        session.delete(u);
         cerrarTodo();
    }
    //Creamos el de autenticar
    public boolean auntenticar(Apoyo2 u)throws Exception
    {
        boolean autenticado= false;
          
               for(Apoyo2 us:buscarTodos()){
        if (u.getLogin().equals(us.getLogin())&&u.getPassword().equals(us.getPassword())){
            autenticado=true;
        }
        
    }
        return autenticado;
    }
    
}
