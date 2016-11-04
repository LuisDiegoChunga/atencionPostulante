package atencion.clases;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AtencionDAO {
    EntityManagerFactory emf;
    EntityManager em;
    
    private void conectar(){
        emf = Persistence.createEntityManagerFactory("atencionPU");
        em = emf.createEntityManager();
    }
    
    private void desconectar(){
        em.close();
        emf.close();
    }
    
    //Listar Postulantes
    public List<Postulante> listarPostulantes(){
        conectar();
        
        List<Postulante> postulantes = em.createQuery("SELECT p FROM Postulante p").getResultList();
        
        desconectar();
        return postulantes;
    }
    
    //Listar Postulantes segun nombre
    public List<Postulante> obtenerPostulantesSegunNombre(String filtroNombre){
        conectar();
        
        Query query = em.createQuery("select p from Postulante p where p.nombre like :filtroNombre");
        query.setParameter("filtroNombre", filtroNombre + "%");
        
        List<Postulante> postulantes = query.getResultList();
        
        desconectar();
        return postulantes;
    }
    
    //Listar Postulantes segun DNI
    public List<Postulante> obtenerPostulantesSegunDNI(String filtroDNI){
        conectar();
        
        Query query = em.createQuery("select p from Postulante p where p.dni like :filtroDNI");
        query.setParameter("filtroDNI", filtroDNI + "%");
        
        List<Postulante> postulantes = query.getResultList();
        
        desconectar();
        return postulantes;
    }
    
    //Obtener postulante segun su codigo
    public Postulante obtenerPostulante(long codP){
        conectar();
        
        Postulante postulante = em.find(Postulante.class, codP);
        
        desconectar();
        return postulante;
    }
    
    //Registrar Postulante
    public void registrarPostulante(Postulante postulante){
        conectar();
        
        em.getTransaction().begin();
        em.persist(postulante);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Modificar Postulante
    public void modificarPostulante(Postulante postulante){
        conectar();
        
        em.getTransaction().begin();
        em.merge(postulante);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Eliminar Postulante
    public void eliminarPostulante(long codP){
        conectar();
        
        Postulante postulante = em.find(Postulante.class, codP);
        em.getTransaction().begin();
        em.remove(postulante);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Registrar Entrevista
    public void registrarEntrevista(Entrevista entrevista){
        conectar();
        
        em.getTransaction().begin();
        em.persist(entrevista);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Eliminar Entrevista
    public void eliminarEntrevista(long codEnt){
        conectar();
        
        Entrevista entrevista = em.find(Entrevista.class, codEnt);
        em.getTransaction().begin();
        em.remove(entrevista);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Registrar Examen Clinico
    public void registrarExamenClinico(ExamenClinico examenClinico){
        conectar();
        
        em.getTransaction().begin();
        em.persist(examenClinico);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Eliminar Examen Clinico
    public void eliminarExamenClinico(long codExaC){
        conectar();
        
        ExamenClinico examenC = em.find(ExamenClinico.class, codExaC);
        em.getTransaction().begin();
        em.remove(examenC);
        em.getTransaction().commit();
        
        desconectar();
    }
    
    //Obtener usuario
    public Usuario obtenerUsuario(String user){
        conectar();
        
        Query query = em.createQuery("select u from Usuario u where u.usuario=:user");
        query.setParameter("user", user);
        Usuario usu;
        try {
            usu = (Usuario)query.getSingleResult();
        } catch (NoResultException e) {
            usu = null;
        }
        
        desconectar();
        return usu;
    }
    
}
