/* package erekiradds.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
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
  
              abilities.add(new MoveEffectAbility(0f, -7f, Pal.sapBulletBack, Fx.missileTrailShort, 4f){{
                  teamColor = true;
              }});
  
              for(float f : new float[]{-3f, 3f}){
                  parts.add(new HoverPart(){{
                      x = 3.9f;
                      y = f;
                      mirror = true;
                      radius = 6f;
                      phase = 90f;
                      stroke = 2f;
                      layerOffset = -0.001f;
                      color = Color.valueOf("bf92f9");
                  }});
              }
  
              weapons.add(new Weapon("elude-weapon"){{
                  shootSound = Sounds.blaster;
                  y = -2f;
                  x = 4f;
                  top = true;
                  mirror = true;
                  reload = 40f;
                  baseRotation = -35f;
                  shootCone = 360f;
  
                  shoot = new ShootSpread(2, 11f);
  
                  bullet = new BasicBulletType(5f, 16){{
                      homingPower = 0.19f;
                      homingDelay = 4f;
                      width = 7f;
                      height = 12f;
                      lifetime = 30f;
                      shootEffect = Fx.sparkShoot;
                      smokeEffect = Fx.shootBigSmoke;
                      hitColor = backColor = trailColor = Pal.suppress;
                      frontColor = Color.white;
                      trailWidth = 1.5f;
                      trailLength = 5;
                      hitEffect = despawnEffect = Fx.hitBulletColor;
                  }};
              }});
          }};
*/
