package erekiradds.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.heat.HeatProducer;
import mindustry.world.blocks.production.*;
import mindustry.world.draw.*;
import erekiradds.content.ErekirAdditionsItems.*;

import static mindustry.type.ItemStack.*;

public class ErekirAdditionsBlocks {
    public static Block
    //Turrets

    //Drills/Production

    //Distribution
  
    //Liquid

    //Power

    //Defense

    //Crafting
    graphiteDecompressor, staticSmelter;

    //Units/Payload

    //Effect

    //Environment

    public static void load(){

        // Turrets

        // Drills/Production

        // Distribution

        // Liquid
      
        // Power

        // Defense

        // Crafting

        graphiteDecompressor = new GenericCrafter("1-graphite-decompressor"){{
            requirements(Category.crafting, with(Items.graphite, 80, Items.silicon, 40, Items.beryllium, 40));

            size = 3;
            squareSprite = false;

            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawGlowRegion("-glow"){{
                        color = Color.valueOf("#fdb380");
                    }},
                    new DrawCrucibleFlame(){{
                        flameColor = (Color.valueOf("#fdb380"));
                        particleRad = 12;
                        particleSize = 1;
                    }}
            );

            craftEffect = new ParticleEffect(){{
                sizeFrom = 3;
                sizeTo = 0;
                particles = 8;
                region = "circle";
                colorFrom = Color.valueOf("#fdb38088");
                colorTo = Color.valueOf("#fdb38088");
                lightColor = Color.valueOf("#fdb38088");
                lifetime = 30;
                length = 4;
            }};

            health = 240;

            outputItem = new ItemStack(ErekirAdditionsItems.erekirCoal, 2);
            craftTime = 120;

            consumeItem(Items.graphite, 1);
            consumePower(2f);
        }};

        staticSmelter = new HeatProducer("2-static-smelter"){{
            requirements(Category.crafting, with(Items.tungsten, 120, Items.silicon, 80, Items.beryllium, 80, Items.oxide, 40));

            size = 3;
            squareSprite = true;

            drawer = new DrawMulti(
                    new DrawRegion("-bottom"),
                    new DrawPlasma(){{
                        plasma1 = Color.valueOf("#d1efff");
                        plasma2 = Color.valueOf("#8ca9e8");
                    }},
                    new DrawDefault(),
                    new DrawHeatOutput()
            );

            health = 680;

            outputItem = new ItemStack(ErekirAdditionsItems.staticGlass, 1);
            craftTime = 180;
            heatOutput = 8;

            consumeItems(with(Items.sand, 4, Items.tungsten, 2));
            consumePower(5f);
        }};
        // Units
      
        // Effect

        //Environment
    }
}
