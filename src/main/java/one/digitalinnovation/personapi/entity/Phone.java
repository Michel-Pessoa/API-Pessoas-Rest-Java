package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "telefone")
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telefone")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tipo_telefone", length = 10)
    private PhoneType type;

    @Column(nullable = false, name = "numero_telefone", length = 14)
    private String number;

    @ManyToMany(mappedBy = "phones")
    private List<Person> person;


}
