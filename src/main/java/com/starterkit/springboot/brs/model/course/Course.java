package com.starterkit.springboot.brs.model.course;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "course")

public class Course {

    @Id
    private String id;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String code;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String name;

    private boolean active;

    private Date createAt;

    private String details;

    private String imageUrl;

    @DBRef(lazy = true)
    private Set<Subject> subjects;


}