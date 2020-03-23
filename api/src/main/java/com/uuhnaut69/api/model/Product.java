package com.uuhnaut69.api.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

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

    @Column(columnDefinition = "text", nullable = true)
    private String productName;

    @Column(nullable = false)
    private String madeIn;

    @Column(columnDefinition = "text", nullable = false)
    private String material;
}