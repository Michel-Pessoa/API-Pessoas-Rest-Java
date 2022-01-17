package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotBlank (message = "Campo não informado")
    @Size(min = 2, max = 100, message = "Campo deve ter entre 2 e 100 caracteres")
    private String firstName;

    @NotBlank (message = "Campo não informado")
    @Size(min = 2, max = 100, message = "Campo deve ter entre 2 e 100 caracteres")
    private String lastName;

    @NotBlank (message = "Campo não informado")
    @CPF(message = "CPF inválido!")
    private String cpf;

    private String birthDate;

    @Valid
    private List<PhoneDTO> phones;
}
