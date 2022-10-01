package dev.tr7zw.xisumatweeks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class XisumatweeksMod extends XisumatweeksSharedMod implements ModInitializer {

	@Override
	public void onInitialize() {
		init();
	}
	
    @Override
    public void initModloader() {
        ClientTickEvents.START_CLIENT_TICK.register(e ->
        {
            this.clientTick();
        });
        KeyBindingHelper.registerKeyBinding(keybind);
    }
	
}