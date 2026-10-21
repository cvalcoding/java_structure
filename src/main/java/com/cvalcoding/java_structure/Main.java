package com.cvalcoding.java_structure;

import com.cvalcoding.java_structure.model.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

  public static void main(String[] args) {
    log.info("Début de l'app");
  }

  public static void hibernateExample() {
    EntityManagerFactory entityManagerFactory =
        Persistence.createEntityManagerFactory("employee_project");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    try {
      EntityTransaction tx = entityManager.getTransaction();
      tx.begin();
      Employee employee = new Employee("Murphy", "Diane");
      entityManager.persist(employee);
      tx.commit();
    } catch (Exception e) {
      log.error("Error in backend : {}", e.getMessage());
    } finally {
      entityManager.close();
    }
  }
}
