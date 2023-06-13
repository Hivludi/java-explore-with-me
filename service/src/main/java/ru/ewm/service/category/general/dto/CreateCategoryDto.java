package ru.ewm.service.category.general.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryDto {
    @NotBlank(message = "Blank name")
    @Size(max = 50, message = "Name is too long")
    private String name;

    @Override
    public String toString() {
        return "CreateCategoryDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
