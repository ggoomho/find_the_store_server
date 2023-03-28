package com.cholssoft.findthestore.common.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
public class BaseTimeEntity extends BaseEntity {
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    protected LocalDateTime createdAt;
}
