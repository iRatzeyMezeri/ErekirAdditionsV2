package erekiradds.content;

import mindustry.content.Blocks;
import mindustry.world.meta.*;

public class PsammosAttributes {
    public static void load(){
        Attribute.add("carbon-concentration");
    }

    public static void setAttributes(){
        Blocks.carbonWall.attributes.set(Attribute.get("carbon-concentration"), 1);
        Blocks.arkyicWall.attributes.set(Attribute.get("carbon-concentration"), 0.75f);
        Blocks.StoneWall.attributes.set(Attribute.get("carbon-concentration"), 0.5f);
    }
}
