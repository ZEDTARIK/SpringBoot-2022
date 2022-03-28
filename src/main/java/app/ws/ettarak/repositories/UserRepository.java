package app.ws.ettarak.repositories;

import org.springframework.data.repository.CrudRepository;

import app.ws.ettarak.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
