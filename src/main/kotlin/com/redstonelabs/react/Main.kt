package com.redstonelabs.react

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("This is a test message! :D")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
