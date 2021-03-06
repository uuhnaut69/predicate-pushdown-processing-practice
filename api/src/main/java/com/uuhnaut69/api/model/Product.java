package com.uuhnaut69.api.model;

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * @author uuhnaut
 * @project demo
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends AbstractEntity {

    @Column(columnDefinition = "text", nullable = false)
    private String productName;

    @Column(nullable = false)
    private String madeIn;

    @Column(columnDefinition = "text", nullable = false)
    private String material;

    @Column(nullable = false)
    private BigDecimal price;

    public static final Attribute<Product, Long> ID = new SimpleAttribute<Product, Long>("id") {
        @Override
        public Long getValue(Product p, QueryOptions queryOptions) {
            return p.getId();
        }
    };
}
