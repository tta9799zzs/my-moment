package com.hunganh.mymoment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Node
public class Reaction {
    private long userId;
    private int type;
}
