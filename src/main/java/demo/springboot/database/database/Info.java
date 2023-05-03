package demo.springboot.database.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Info {
    
    @Id
    private String id;
    private String name;
    private String description;

    public Info(String i, String n, String d)
    {
        super();
        id=i;
        name=n;
        description=d;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Info [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
  
}
