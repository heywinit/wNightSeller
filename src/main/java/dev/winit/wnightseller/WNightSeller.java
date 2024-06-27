package dev.winit.wnightseller;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class WNightSeller extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("§awNightSeller is loading!");
    }

    @Override
    public void onDisable() {
        getLogger().info("§cwNightSeller has been disabled!");
    }
}
