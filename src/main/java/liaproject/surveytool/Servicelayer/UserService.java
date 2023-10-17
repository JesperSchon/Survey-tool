package liaproject.surveytool.Servicelayer;

import liaproject.surveytool.Models.User;
import liaproject.surveytool.Repositories.RoleRepository;
import liaproject.surveytool.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;


  public User createUser(User user){
    return userRepository.save(user);
  }

  public void deleteUser(Long userId){
    userRepository.deleteById(userId);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(Long userId){
    return userRepository.findById(userId).orElse(null);
  }



}
