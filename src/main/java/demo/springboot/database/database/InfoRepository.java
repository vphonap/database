package demo.springboot.database.database;

import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<Info,String> {
    
}
