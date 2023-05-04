package demo.springboot.database.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface InfoRepository extends CrudRepository<Info,String> {
    
}

