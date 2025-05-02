package erekiradds.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.heat.HeatProducer;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import erekiradds.content.ErekirAdditionsItems.*;

import static mindustry.type.ItemStack.*;

public class ErekirAdditionsBlocks {
    public static Block
    //Turrets

    //Drills/Production

    //Distribution
  
    //Liquid
    staticConduit, staticRouter, staticJunction, staticBridge,

    //Power
    basicStove,

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
      
        staticConduit = new ArmoredConduit("1-static-conduit"){{
            requirements(Category.liquid, with(ErekirAdditionsItems.staticGlass, 1));
            leaks = false;
            liquidCapacity = 100f;
            liquidPressure = 1.025f;
            health = 600;
            underBullets = true;
        }};
        
        staticJunction = new LiquidJunction("static-conduit-junction"){{
            requirements(Category.liquid, with(ErekirAdditionsItems.staticGlass, 3));
            buildCostMultiplier = 3f;
            health = 500;
            ((Conduit)staticConduit).junctionReplacement = this;
            solid = false;
            underBullets = true;
        }};
        
        staticRouter = new LiquidRouter("2-static-liquid-router"){{
            requirements(Category.liquid, with(Items.graphite, 4, ErekirAdditionsItems.staticGlass, 4));
            liquidCapacity = 500f;
            liquidPadding = 3f/4f;
            underBullets = true;
            solid = false;
            health = 700;

        }};

        staticBridge = new DirectionLiquidBridge("static-bridge-conduit"){{
            requirements(Category.liquid, with(Items.thorium, 3, ErekirAdditionsItems.staticGlass, 8));
            range = 5;
            hasPower = false;
            liquidCapacity = 300f;
            researchCostMultiplier = 1;
            underBullets = true;
            health = 1000;
        }};
        // Power

        basicStove = new ConsumeGenerator("basic-stove"){{
            requirements(Category.power, with(Items.beryllium, 60, Items.graphite, 40, Items.Silicon, 80));
            size = 3;
            squareSprite = false;
            drawer = new drawMulti(
                new DrawRegion("-bottom"),
                new DrawLiquidTile("water"){{
                    alpha = 0.8;
                    padding = 2;
                }},
                new DrawDefault(),
                new DrawGlowRegion("-glow"){{
                    color = Color.valueOf("#d1efff");
                }},
                new DrawArcSmelt(),
                new DrawRegion("-top")
            );
            generateEffect = new MultiEffect(
                new ParticleEffect(){{
                    sizeFrom = 3;
                    sizeTo = 2;
                    lifetime = 60f;
                    lengthOffset = 1.6f;
                    baseRotation = 45;
                    cone = 10;
                }},
                new ParticleEffect(){{
                    sizeFrom = 3;
                    sizeTo = 2;
                    lifetime = 60f;
                    lengthOffset = 1.6f;
                    baseRotation = -45;
                    cone = 10;
                }},
                new ParticleEffect(){{
                    sizeFrom = 3;
                    sizeTo = 2;
                    lifetime = 60f;
                    lengthOffset = 1.6f;
                    baseRotation = 135;
                    cone = 10;
                }},
                new ParticleEffect(){{
                    sizeFrom = 3;
                    sizeTo = 2;
                    lifetime = 60f;
                    lengthOffset = 1.6f;
                    baseRotation = -135;
                    cone = 10;
                }}
            );
            health = 280;
            hasPower = true;
            hasLiquids = true;
            powerProduction = 270f/60f;
            consumeItem(ErekirAdditionsItems.erekirCoal, 1);
            consumeLiquid(Liquids.Water, 12f/60f);
        }};
                        

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

            consumeLiquid(Liquids.hydrogen, 4f / 60f);
            consumeItems(with(Items.sand, 4, Items.tungsten, 2));
            consumePower(5f);
        }};
        // Units
      
        // Effect

        //Environment
    }
}
