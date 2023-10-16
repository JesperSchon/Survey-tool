package liaproject.surveytool.repositories;

import liaproject.surveytool.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  // Här kan du lägga till egna query-metoder om det behövs senare.
}