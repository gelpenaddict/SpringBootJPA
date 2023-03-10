package io.javabrains.springbootstarter.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // Tells JPA to create a table
public class Topic {

    // TODO: try Lombok @Data, @NoArgsConstructor, @AllArgsContructor

    @Id // primary key, required annotation
    private String id;
    private String name;

    private String description;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
