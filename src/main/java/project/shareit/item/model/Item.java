package project.shareit.item.model;

import lombok.Data;
import lombok.NonNull;

/**
 * TODO Sprint add-controllers.
 */
@Data
public class Item {
    @NonNull
    Long ItemID;
    @NonNull
    String itemDescription;
}
