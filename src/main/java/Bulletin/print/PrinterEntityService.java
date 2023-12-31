package Bulletin.print;

import Bulletin.persistence.EntityManagerHandler;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PrinterEntityService {
    private final EntityManager entityManager = EntityManagerHandler.getEntityManager();
    private  static PrinterEntityService instance = null;
    public static PrinterEntityService getInstance(){
        return instance == null ? new PrinterEntityService() : instance;
    }

    public void persistePrintedInfo(PrinterEntity printerEntity){
        entityManager.getTransaction().begin();
        entityManager.persist(printerEntity);
        entityManager.getTransaction().commit();
    }
    public int getLastId(){
        Query query = entityManager.createQuery("SELECT MAX(id) AS id_max FROM PrinterEntity", PrinterEntity.class);
        return  (int) query.getSingleResult();

    }
}
