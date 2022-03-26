package no.ntnu.idi.IDATT2105.qsProsjekt.repository;

import no.ntnu.idi.IDATT2105.qsProsjekt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}