package app.ws.ettarak.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.ws.ettarak.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
