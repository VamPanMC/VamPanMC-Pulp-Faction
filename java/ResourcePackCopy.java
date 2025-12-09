//This as only been tested in NeoForge 1.21.1 to 1.21.8
package net.namespace.modid; //change this to your package information

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.bus.api.SubscribeEvent;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD) // 1.21.1 & 1.21.4  just @EventBusSubscriber for 1.21.8
public class ResourcePackCopy {

    @SubscribeEvent
    public static void onSetup(FMLCommonSetupEvent event) {
        Path resourcePacksDir = Paths.get("resourcepacks");
        Path targetPack = resourcePacksDir.resolve("YOURPACKNAME.zip");
        // YOUR PACK MUST BE IN your src/main/resource/YOURPACKNAME.zip
        if (!Files.exists(targetPack)) {
            try (InputStream is = ResourcePackCopy.class.getResourceAsStream("/YOURPACKNAME.zip")) {
                if (is != null) {
                    Files.createDirectories(resourcePacksDir);
                    Files.copy(is, targetPack);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}   
