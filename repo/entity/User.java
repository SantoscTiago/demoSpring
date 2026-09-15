@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unullable = false, unique = true)
    private String username;

    @Column(unullable = false, unique = false)
    private String password;

    @Column(name = "token_value")    // Java name differs from column → we say the column name
    private String tokenValue;

    @Column(name = "created_at", nullable = false)  // BIGINT → Long
    private Long createdAt;
}