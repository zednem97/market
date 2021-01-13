package mx.com.it.market.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.it.market.modelo.Empleado;

public class EmpleadoDAO {
 
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public EmpleadoDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
     public List<Empleado> listar() {
        String hql = "SELECT p FROM Empleado p";
        Query query = em.createQuery(hql);
        List<Empleado> empleados = query.getResultList();
        return empleados;
    }

    
}

