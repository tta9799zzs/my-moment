package com.hunganh.mymoment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Node
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;

    @Relationship(type = "HAS_POST")
    private Set<Post> posts;
}
