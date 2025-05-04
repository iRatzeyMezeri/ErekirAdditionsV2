package erekiradds.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.content.Fx;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class ErekirAdditionsUnitTypes{
  public static UnitType

  // hoverboard
  mass, inertia;

  public static void load() {
     mass = new ErekirUnitType("mass"){{
              UnitEntity::Create;
              hovering = true;
              canDrown = false;
              shadowElevation = 0.1f;
  
              drag = 0.1f;
              speed = 2f;
              rotateSpeed = 5f;
  
              accel = 0.1f;
              health = 600f;
              armor = 1f;
              hitSize = 11f;
              engineOffset = 7f;
              engineSize = 2f;
              itemCapacity = 0;
              useEngineElevation = false;
              researchCostMultiplier = 0f;
  
              abilities.add(new MoveEffectAbility(0f, -7f, Color.valueOf("5e7ccb"), Fx.missileTrailShort, 4f){{
                  teamColor = true;
              }});
  
              for(float f : new float[]{-3f, 3f}) {
                  parts.add(new HoverPart() {{
                      x = 4f;
                      y = -4.5f;
                      mirror = true;
                      radius = 6f;
                      phase = 90f;
                      stroke = 2f;
                      layerOffset = -0.001f;
                      color = Color.valueOf("#91aaed");
                  }});
              }
              for(float f : new float[]{-3f, 3f}){
                 parts.add(new HoverPart(){{
                     x = 4f;
                     y = 4.5f;
                     mirror = true;
                     radius = 6f;
                     phase = 90f;
                     stroke = 2f;
                     layerOffset = -0.001f;
                     color = Color.valueOf("#91aaed");
                 }});
              }
  
              weapons.add(new Weapon("mass-weapon"){{
                  shootSound = Sounds.blaster;
                  x = 4f;
                  y = 2f;
                  top = true;
                  mirror = true;
                  reload = 30f;
                  baseRotation = -35f;
                  shootSound = Sounds.sap;
                  alternate = true;
  
                  bullet = new ShrapnelBulletType(){{
                      lifetime = 20f;
                      pierce = true;
                      pierceCap = 2;
                      length = 105;
                      width = 5;
                      damage = 15f;
                      serrations = 1;
                      hitEffect = Fx.blastExplosion;
                      shootEffect = Fx.blastExplosion;
                      collidesTeam = true;
                      healAmount = 7f;
                      healColor = Color.valueOf("91aaed");
                      fromColor = Color.valueOf("91aaed");
                      toColor = Color.valueOf("5e7ccb");
                  }};
              }});
        }};
    };
}

