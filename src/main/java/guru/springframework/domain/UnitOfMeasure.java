package guru.springframework.domain;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure extends AbstractEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
