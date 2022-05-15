package pruebaTecnica.prueba.persistence.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
    /**
     * Private variable long for id of user
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "identification")
    private long identification;

    @Column(name = "number")
    private long number;

    @Column(name = "name")
    private String name;

    public User() {

    }

    /**
     * <p>
     * This method is used for build a object user with entity attributes
     * </p>
     * @param identification of the user
     * @param number of the user
     * @param name of the user
     * @return void
     * @since 1.0
     */

    public User(Long identification, Long number, String name) {
        this.identification = identification;
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", identification=" + identification + ", number=" + number + ", name=" + name + "]";
    }
}
