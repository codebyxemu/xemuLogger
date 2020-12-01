package me.xemu.api.xemulogger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class XemuLogger extends JavaPlugin
{

    private static String prefix = "";


    public static String setPrefix(String value)
    {
        return prefix = "["+value+"] ";
    };

    public static void log(Object object)
    {
        if(prefix == "" || prefix == null)
        {
            System.out.println("[XemuLogger] Exception in log()");
            System.out.println("Please set a prefix using setPrefix(String value)");
            return;
        };
        System.out.println(prefix + object);
    };

    @Override public void onEnable()
    {
        System.out.println(prefix + "Loaded Logger");
    };

    @Override public void onDisable()
    {
        System.out.println(prefix + "Disabled Logger");
    };
    
};
