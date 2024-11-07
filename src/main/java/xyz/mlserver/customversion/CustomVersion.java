package xyz.mlserver.customversion;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import xyz.mlserver.customversion.listeners.ProxyPingListener;

public final class CustomVersion extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new ProxyPingListener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
