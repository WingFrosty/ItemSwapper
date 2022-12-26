package dev.tr7zw.itemswapper.manager.itemgroups;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ItemEntry {

    private final Item item;
    private final ResourceLocation link;
    
    public ItemEntry(Item item, ResourceLocation link) {
        this.item = item;
        this.link = link;
    }

    public Item getItem() {
        return item;
    }

    public ResourceLocation getLink() {
        return link;
    }
    
}
