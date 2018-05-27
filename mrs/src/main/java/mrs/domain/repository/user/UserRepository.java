package mrs.domain.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import mrs.domain.model.User;

// JpaRepository interface を継承してUserエンティティ用のリポジトリインターフェイスを作成. 型<User, String>
public interface UserRepository extends JpaRepository<User, String> {
}
