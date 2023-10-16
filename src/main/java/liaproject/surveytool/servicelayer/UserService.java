package liaproject.surveytool.servicelayer;

import liaproject.surveytool.models.User;
import liaproject.surveytool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User createUser(User user){
    return userRepository.save(user);
  }
}
