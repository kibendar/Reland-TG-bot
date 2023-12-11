package bot.telegram.relandbot.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "user_bot")
@Getter
@Setter
@NoArgsConstructor
@Data
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "embede_joke")
    private Boolean embedeJoke;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "registered_at")
    private java.sql.Timestamp registeredAt;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name ="username")
    private String userName;

    @Column(name ="latitude" )
    private Double latitude;

    @Column(name ="longitude")
    private Double longitude;

    @Column(name = "bio")
    private String bio;

    @Column(name = "description")
    private String description;

    @Column(name = "pinned_message")
    private String pinnedMessage;

}