package liaproject.surveytool.Repositories;

import liaproject.surveytool.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  // Här kan du lägga till egna query-metoder om det behövs senare.
}