package erekiradds;

import arc.util.*;
import mindustry.mod.*;

import erekiradds.content.*;

public class ErekirAdditions extends Mod{

    public ErekirAdditions(){
        Log.info("decided to add stuff to Erekir");
    }

    @Override
    public void loadContent(){
        Log.info("adding stuff to Erekir");
        
        ErekirAdditionsItems.load();
        ErekirAdditionsBlocks.load();
        ErekirAdditionsAttributes.load();
        // ErekirAdditionsUnits.load();
    }

}
