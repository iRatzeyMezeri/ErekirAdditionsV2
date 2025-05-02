package erekiradds.content;

import mindustry.content.Blocks;
import mindustry.world.meta.*;

public class ErekirAdditionsAttributes {
    public static void load(){
        Attribute.add("carbon-concentration");
    }

    public static void setAttributes(){
        Blocks.graphiticWall.attributes.set(Attribute.get("carbon-concentration"), 1.75f);
        Blocks.carbonWall.attributes.set(Attribute.get("carbon-concentration"), 1);
        Blocks.arkyicWall.attributes.set(Attribute.get("carbon-concentration"), 0.75f);
        Blocks.StoneWall.attributes.set(Attribute.get("carbon-concentration"), 0.5f);
    }
}
