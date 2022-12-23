package net.javaguides.springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    @NotEmpty(message="{validation.firstNameEmpty}")
    @Length(min=1, max=19, message="{validation.firstNameCharacterLimit}")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message="{validation.LastNameEmpty}")
    @Length(min=1, max=19, message="{validation.LastNameCharacterLimit}")
    private String lastName;

    @Column(name = "email_id")
    @NotEmpty(message="{validation.EmailIdEmpty}")
    @Pattern(regexp = "[\\w\\-._]+@[\\w\\-._]+\\.[A-Za-z]+", message = "{validation.emailIdInvalid}")
    private String emailId;
}
