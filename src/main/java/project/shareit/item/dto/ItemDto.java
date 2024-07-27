package project.shareit.item.dto;

import org.springframework.stereotype.Repository;
import project.shareit.item.model.Item;
import project.shareit.user.model.User;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemDto {

    private Map<Long, Item> items = new HashMap<>();

    public String getAllItemsFromDB(){
        return items.values().toString();
    }

    public String addItemToDB(Item item){
        items.put(item.getItemID(), item);
        return "Item added successful";
    }

    public String editItemFromDB(Long itemID, Item item){
        if(items.containsKey(itemID)){
            items.remove(itemID, item);
            items.put(itemID, item);
            return "Item info updated successful";
        }else{
            return "Item not found";
        }
    }
}
