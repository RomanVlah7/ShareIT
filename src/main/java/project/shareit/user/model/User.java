package project.shareit.user.model;

import lombok.Data;
import lombok.NonNull;

/**
 * TODO Sprint add-controllers.
 */
@Data
public class User {
    @NonNull
    private Long userID;
    @NonNull
    private String userName;
}
