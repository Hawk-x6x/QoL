package com.hawkx6x.qol;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class breakEvent implements Listener {
    @EventHandler
    public static void onBreakStem(BlockBreakEvent e){
        Location loc = e.getBlock().getLocation();
        Material mat = e.getPlayer().getWorld().getBlockAt(loc).getType();
        ItemStack item = e.getPlayer().getItemInHand();
        if (mat == Material.PUMPKIN_STEM || mat == Material.MELON_STEM){
            if(item.getType() == Material.WOOD_HOE) return;
            e.setCancelled(true);
        }
    }
}
