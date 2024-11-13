package com.redstonelabs.react

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("This is a test message!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
