package erekiradds.content;

import mindustry.content.Blocks;
import mindustry.world.meta.*;

public class ErekirAdditionsAttributes {
    public static void load(){
        Attribute.add("carbon");
    }

    public static void setAttributes(){
        Blocks.graphiticWall.attributes.set(Attribute.get("carbon"), 1.75f);
        Blocks.carbonWall.attributes.set(Attribute.get("carbon"), 1);
        Blocks.arkyicWall.attributes.set(Attribute.get("carbon"), 0.75f);
        Blocks.stoneWall.attributes.set(Attribute.get("carbon"), 0.5f);
    }
}
