package core.repository;


import core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author MuriloVIctor
 */
public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
}