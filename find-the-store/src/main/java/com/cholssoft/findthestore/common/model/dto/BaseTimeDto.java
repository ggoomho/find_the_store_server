package com.cholssoft.findthestore.common.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseTimeDto extends BaseDto {
    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;
}