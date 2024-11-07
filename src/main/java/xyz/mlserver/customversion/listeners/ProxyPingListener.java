package xyz.mlserver.customversion.listeners;

import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import xyz.mlserver.mcversion.MCVersion;

public class ProxyPingListener implements Listener {

    @EventHandler
    public void onPing(ProxyPingEvent e) {
        ServerPing ping = e.getResponse();
        ping.getVersion().setProtocol(MCVersion.v1_21_1.getProtocolVersion());
    }

}
