package OPP_Object_Oriented_Programming.models;

import lombok.*;

//@Setter
//@Getter
@RequiredArgsConstructor
//@ToString
//@Data but delete setter getter and to-string
@Data
public class Users {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String profile;
}
