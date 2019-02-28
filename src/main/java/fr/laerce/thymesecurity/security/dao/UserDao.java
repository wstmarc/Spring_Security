package fr.laerce.thymesecurity.security.dao;

import fr.laerce.thymesecurity.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Projet thyme-security
 * Pour LAERCE SAS
 * <p>
 * Créé le  21/03/2017.
 *
 * @author fred
 */
public interface UserDao extends JpaRepository<User, Long>{
    User findByName(String name);
}
