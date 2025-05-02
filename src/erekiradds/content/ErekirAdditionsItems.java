package erekiradds.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class ErekirAdditionsItems {
    public static Item
            erekirCoal, staticGlass;

    public static final Seq<Item> erekirAdditionsItems = new Seq<>();

    public static void load() {
        erekirCoal = new Item("erekircoal", Color.valueOf("#272727")) {{
            explosiveness = 0.2f;
            flammability = 1f;
            buildable = false;
        }};

        staticGlass = new Item("static-glass", Color.valueOf("#8ca9e8")) {{
            cost = 4f;
        }};

        erekirAdditionsItems.addAll(
                erekirCoal, staticGlass;
        );
    }
}
