package com.hawkx6x.qol;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class QoL extends JavaPlugin {

    @Override
    public void onEnable() {
        breakEvent be = new breakEvent();
        getServer().getPluginManager().registerEvents(be, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+ "[QoL] ENABLED");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED+ "[QoL] DISABLED");
    }
}
