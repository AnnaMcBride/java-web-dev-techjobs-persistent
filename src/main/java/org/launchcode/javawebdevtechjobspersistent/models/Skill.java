package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy ="skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(min= 1, max = 250)
    @NotBlank(message = "This field cannot be left blank")
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill(){}

    @Override
    public Object getEmployer(){
        return null;
    }


}

