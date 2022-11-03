package it.develhope.dbnoSQLOrm.repository;

import it.develhope.dbnoSQLOrm.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
