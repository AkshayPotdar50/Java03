package com.java.sprint8;

public class Test11 {
    /*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CriteriaApiExample {

    public static void main(String[] args) {
        // Setup Hibernate session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Open a new session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        // Create a CriteriaBuilder
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        // Create a CriteriaQuery
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

        // Specify the root entity (from clause)
        Root<Employee> root = criteriaQuery.from(Employee.class);

        // Add a simple predicate (where clause)
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("department"), "Sales"));

        // Execute the query
        Query<Employee> query = session.createQuery(criteriaQuery);
        List<Employee> result = query.getResultList();

        // Print the results
        for (Employee employee : result) {
            System.out.println(employee.getName());
        }

        // Commit the transaction and close the session
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
*/
}
