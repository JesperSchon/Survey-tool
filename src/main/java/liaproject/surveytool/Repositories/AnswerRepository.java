package liaproject.surveytool.Repositories;

import liaproject.surveytool.Models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
  // Här kan du lägga till egna query-metoder om det behövs senare.
}
