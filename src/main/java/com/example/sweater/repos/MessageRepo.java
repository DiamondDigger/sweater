package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo {
    public interface UserRepository extends CrudRepository<Message, Integer> {
    }
}
