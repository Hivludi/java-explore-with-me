package ru.ewm.service.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDto {

    @NotBlank(message = "Empty email")
    @Email(message = "Invalid email")
    @Size(max = 254, message = "Email is too long")
    @Size(min = 6, message = "Email is too short")
    private String email;
    private Long id;
    @NotBlank(message = "Empty name")
    @Size(max = 250, message = "Name is too long")
    @Size(min = 2, message = "Name is too short")
    private String name;

    @Override
    public String toString() {
        return "CreateUserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
