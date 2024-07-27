package project.shareit.item;

import org.springframework.web.bind.annotation.*;
import project.shareit.item.model.Item;
import project.shareit.user.model.User;

/**
 * TODO Sprint add-controllers.
 */
@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemService itemService = new ItemService();

    @GetMapping("/allItems")
    public String getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping("/addItem")
    public String addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PatchMapping("/editItem")
    public String editItem(@RequestHeader Long itemID, @RequestBody Item item){
        return itemService.editItem(itemID, item);
    }
}
