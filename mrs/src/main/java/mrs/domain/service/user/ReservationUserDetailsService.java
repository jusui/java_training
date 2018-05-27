package mrs.domain.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mrs.domain.model.User;
import mrs.domain.repository.user.UserRepository;

@Service
public class ReservationUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// ユーザ取得処理は UserRepository に委譲
		User user = userRepository.findOne(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + " is not found.");
		}
		return new ReservationUserDetails(user);
	}
}
