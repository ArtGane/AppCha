package com.herbecha.app.service;

import com.herbecha.app.model.User;
import com.herbecha.app.data.UserRepository;
import com.herbecha.app.model.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email);
    }

    public void createUser(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setLastname(userDto.getLastname());
        user.setFirstname(userDto.getFirstname());
        user.setPassword(userDto.getPassword());
        user.setAddress(userDto.getAddress());
        user.setCity(userDto.getCity());
        user.setCp(userDto.getCp());
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public void updateUser(User user) {
        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new IllegalArgumentException("Utilisateur non trouvé"));
        existingUser.setFirstname(user.getFirstname());
        existingUser.setLastname(user.getLastname());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setAddress(user.getAddress());
        existingUser.setCp(user.getCp());
        existingUser.setCity(user.getCity());
        userRepository.save(existingUser);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
