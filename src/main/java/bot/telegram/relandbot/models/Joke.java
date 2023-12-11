package bot.telegram.relandbot.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "joke")
@Data
public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "body", length = 255000)
    private String body;

    @Column(name = "category")
    private String category;

    @Column(name = "rating")
    private double rating;
}
