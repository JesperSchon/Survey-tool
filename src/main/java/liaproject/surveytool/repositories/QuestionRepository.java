package liaproject.surveytool.repositories;

import liaproject.surveytool.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
  // Här kan du lägga till egna query-metoder om det behövs senare.
}
