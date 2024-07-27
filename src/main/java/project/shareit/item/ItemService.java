package project.shareit.item;

import org.springframework.stereotype.Service;
import project.shareit.item.dto.ItemDto;
import project.shareit.item.model.Item;
import project.shareit.user.model.User;

@Service
public class ItemService {

    private ItemDto itemDto = new ItemDto();

    public String getAllItems(){
        return itemDto.getAllItemsFromDB();
    }

    public String addItem(Item item){
        return itemDto.addItemToDB(item);
    }

    public String editItem(Long itemID, Item item){
        return itemDto.editItemFromDB(itemID, item);
    }
}
