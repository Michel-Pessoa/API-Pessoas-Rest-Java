package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa")
    private Long id;

    @Column(nullable = false, length = 100, name = "nome")
    private String firstName;

    @Column(nullable = false, length = 100, name = "sobrenome")
    private String lastName;


    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "pessoa_telefone",
            joinColumns = { @JoinColumn(name = "id_pessoa",
                    foreignKey = @ForeignKey(name = "fk_pessoa_telefone_pessoa")) },
            inverseJoinColumns = { @JoinColumn(name = "id_telefone",
                    foreignKey = @ForeignKey(name = "fk_pessoa_telefone_telefone")) })
    private List<Phone> phones;
}
