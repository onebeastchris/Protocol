package org.cloudburstmc.protocol.bedrock.data;

public enum SoundEvent {
    ITEM_USE_ON,
    HIT,
    STEP,
    FLY,
    JUMP,
    BREAK,
    PLACE,
    HEAVY_STEP,
    GALLOP,
    FALL,
    AMBIENT,
    AMBIENT_BABY,
    AMBIENT_IN_WATER,
    BREATHE,
    DEATH,
    DEATH_IN_WATER,
    DEATH_TO_ZOMBIE,
    HURT,
    HURT_IN_WATER,
    MAD,
    BOOST,
    BOW,
    SQUISH_BIG,
    SQUISH_SMALL,
    FALL_BIG,
    FALL_SMALL,
    SPLASH,
    FIZZ,
    FLAP,
    SWIM,
    DRINK,
    EAT,
    TAKEOFF,
    SHAKE,
    PLOP,
    LAND,
    SADDLE,
    ARMOR,
    MOB_ARMOR_STAND_PLACE,
    ADD_CHEST,
    THROW,
    ATTACK,
    ATTACK_NODAMAGE,
    ATTACK_STRONG,
    WARN,
    SHEAR,
    MILK,
    THUNDER,
    EXPLODE,
    FIRE,
    IGNITE,
    FUSE,
    STARE,
    SPAWN,
    SHOOT,
    BREAK_BLOCK,
    LAUNCH,
    BLAST,
    LARGE_BLAST,
    TWINKLE,
    REMEDY,
    UNFECT,
    LEVELUP,
    BOW_HIT,
    BULLET_HIT,
    EXTINGUISH_FIRE,
    ITEM_FIZZ,
    CHEST_OPEN,
    CHEST_CLOSED,
    SHULKERBOX_OPEN,
    SHULKERBOX_CLOSED,
    ENDERCHEST_OPEN,
    ENDERCHEST_CLOSED,
    POWER_ON,
    POWER_OFF,
    ATTACH,
    DETACH,
    DENY,
    TRIPOD,
    POP,
    DROP_SLOT,
    NOTE,
    THORNS,
    PISTON_IN,
    PISTON_OUT,
    PORTAL,
    WATER,
    LAVA_POP,
    LAVA,
    BURP,
    BUCKET_FILL_WATER,
    BUCKET_FILL_LAVA,
    BUCKET_EMPTY_WATER,
    BUCKET_EMPTY_LAVA,
    ARMOR_EQUIP_CHAIN,
    ARMOR_EQUIP_DIAMOND,
    ARMOR_EQUIP_GENERIC,
    ARMOR_EQUIP_GOLD,
    ARMOR_EQUIP_IRON,
    ARMOR_EQUIP_LEATHER,
    ARMOR_EQUIP_ELYTRA,
    RECORD_13,
    RECORD_CAT,
    RECORD_BLOCKS,
    RECORD_CHIRP,
    RECORD_FAR,
    RECORD_MALL,
    RECORD_MELLOHI,
    RECORD_STAL,
    RECORD_STRAD,
    RECORD_WARD,
    RECORD_11,
    RECORD_WAIT,
    STOP_RECORD, //Not really a sound
    FLOP,
    ELDERGUARDIAN_CURSE,
    MOB_WARNING,
    MOB_WARNING_BABY,
    TELEPORT,
    SHULKER_OPEN,
    SHULKER_CLOSE,
    HAGGLE,
    HAGGLE_YES,
    HAGGLE_NO,
    HAGGLE_IDLE,
    CHORUS_GROW,
    CHORUS_DEATH,
    GLASS,
    POTION_BREWED,
    CAST_SPELL,
    PREPARE_ATTACK,
    PREPARE_SUMMON,
    PREPARE_WOLOLO,
    FANG,
    CHARGE,
    CAMERA_TAKE_PICTURE,
    LEASHKNOT_PLACE,
    LEASHKNOT_BREAK,
    GROWL,
    WHINE,
    PANT,
    PURR,
    PURREOW,
    DEATH_MIN_VOLUME,
    DEATH_MID_VOLUME,
    IMITATE_BLAZE,
    IMITATE_CAVE_SPIDER,
    IMITATE_CREEPER,
    IMITATE_ELDER_GUARDIAN,
    IMITATE_ENDER_DRAGON,
    IMITATE_ENDERMAN,
    IMITATE_EVOCATION_ILLAGER,
    IMITATE_GHAST,
    IMITATE_HUSK,
    IMITATE_ILLUSION_ILLAGER,
    IMITATE_MAGMA_CUBE,
    IMITATE_POLAR_BEAR,
    IMITATE_SHULKER,
    IMITATE_SILVERFISH,
    IMITATE_SKELETON,
    IMITATE_SLIME,
    IMITATE_SPIDER,
    IMITATE_STRAY,
    IMITATE_VEX,
    IMITATE_VINDICATION_ILLAGER,
    IMITATE_WITCH,
    IMITATE_WITHER,
    IMITATE_WITHER_SKELETON,
    IMITATE_WOLF,
    IMITATE_ZOMBIE,
    IMITATE_ZOMBIE_PIGMAN,
    IMITATE_ZOMBIE_VILLAGER,
    BLOCK_END_PORTAL_FRAME_FILL,
    BLOCK_END_PORTAL_SPAWN,
    RANDOM_ANVIL_USE,
    BOTTLE_DRAGONBREATH,
    PORTAL_TRAVEL,
    ITEM_TRIDENT_HIT,
    ITEM_TRIDENT_RETURN,
    ITEM_TRIDENT_RIPTIDE_1,
    ITEM_TRIDENT_RIPTIDE_2,
    ITEM_TRIDENT_RIPTIDE_3,
    ITEM_TRIDENT_THROW,
    ITEM_TRIDENT_THUNDER,
    ITEM_TRIDENT_HIT_GROUND,
    DEFAULT,
    ELEMENT_CONSTRUCTOR_OPEN,
    FLETCHING_TABLE_USE,
    ICE_BOMB_HIT,
    BALLOON_POP,
    LT_REACTION_ICE_BOMB,
    LT_REACTION_BLEACH,
    LT_REACTION_E_PASTE,
    LT_REACTION_E_PASTE2,
    LT_REACTION_FERTILIZER,
    LT_REACTION_FIREBALL,
    LT_REACTION_MG_SALT,
    LT_REACTION_MISC_FIRE,
    LT_REACTION_FIRE,
    LT_REACTION_MISC_EXPLOSION,
    LT_REACTION_MISC_MYSTICAL,
    LT_REACTION_MISC_MYSTICAL2,
    LT_REACTION_PRODUCT,
    SPARKLER_USE,
    GLOWSTICK_USE,
    SPARKLER_ACTIVE,
    CONVERT_TO_DROWNED,
    BUCKET_FILL_FISH,
    BUCKET_EMPTY_FISH,
    BUBBLE_UP,
    BUBBLE_DOWN,
    BUBBLE_POP,
    BUBBLE_UP_INSIDE,
    BUBBLE_DOWN_INSIDE,
    BABY_HURT,
    BABY_DEATH,
    BABY_STEP,
    BABY_SPAWN,
    BORN,
    BLOCK_TURTLE_EGG_BREAK,
    BLOCK_TURTLE_EGG_CRACK,
    BLOCK_TURTLE_EGG_HATCH,
    TURTLE_LAY_EGG,
    BLOCK_TURTLE_EGG_ATTACK,
    BEACON_ACTIVATE,
    BEACON_AMBIENT,
    BEACON_DEACTIVATE,
    BEACON_POWER,
    CONDUIT_ACTIVATE,
    CONDUIT_AMBIENT,
    CONDUIT_ATTACK,
    CONDUIT_DEACTIVATE,
    CONDUIT_SHORT,
    SWOOP,
    BLOCK_BAMBOO_SAPLING_PLACE,
    PRE_SNEEZE,
    SNEEZE,
    AMBIENT_TAME,
    SCARED,
    BLOCK_SCAFFOLDING_CLIMB,
    CROSSBOW_LOADING_START,
    CROSSBOW_LOADING_MIDDLE,
    CROSSBOW_LOADING_END,
    CROSSBOW_SHOOT,
    CROSSBOW_QUICK_CHARGE_START,
    CROSSBOW_QUICK_CHARGE_MIDDLE,
    CROSSBOW_QUICK_CHARGE_END,
    AMBIENT_AGGRESSIVE,
    AMBIENT_WORRIED,
    CANT_BREED,
    SHIELD_BLOCK,
    LECTERN_BOOK_PLACE,
    GRINDSTONE_USE,
    BELL,
    CAMPFIRE_CRACKLE,
    SWEET_BERRY_BUSH_HURT,
    SWEET_BERRY_BUSH_PICK,
    ROAR,
    STUN,
    CARTOGRAPHY_TABLE_USE,
    TABLE_USE,
    STONECUTTER_USE,
    COMPOSTER_EMPTY,
    COMPOSTER_FILL,
    COMPOSTER_FILL_LAYER,
    COMPOSTER_READY,
    BARREL_OPEN,
    BARREL_CLOSE,
    RAID_HORN,
    LOOM_USE,
    AMBIENT_IN_RAID,
    UI_CARTOGRAPHY_TABLE_USE,
    UI_STONECUTTER_USE,
    UI_LOOM_USE,
    SMOKER_USE,
    BLAST_FURNACE_USE,
    SMITHING_TABLE_USE,
    SCREECH,
    SLEEP,
    FURNACE_USE,
    MOOSHROOM_CONVERT,
    MILK_SUSPICIOUSLY,
    CELEBRATE,
    JUMP_PREVENT,
    AMBIENT_POLLINATE,
    BEEHIVE_DRIP,
    BEEHIVE_ENTER,
    BEEHIVE_EXIT,
    BEEHIVE_WORK,
    BEEHIVE_SHEAR,
    HONEYBOTTLE_DRINK,
    AMBIENT_CAVE,
    RETREAT,
    CONVERT_TO_ZOMBIFIED,
    ADMIRE,
    STEP_LAVA,
    TEMPT,
    PANIC,
    ANGRY,
    AMBIENT_WARPED_FOREST,
    AMBIENT_SOULSAND_VALLEY,
    AMBIENT_NETHER_WASTES,
    AMBIENT_BASALT_DELTAS,
    AMBIENT_CRIMSON_FOREST,
    RESPAWN_ANCHOR_CHARGE,
    RESPAWN_ANCHOR_DEPLETE,
    RESPAWN_ANCHOR_SET_SPAWN,
    RESPAWN_ANCHOR_AMBIENT,
    SOUL_ESCAPE_QUIET,
    SOUL_ESCAPE_LOUD,
    RECORD_PIGSTEP,
    LINK_COMPASS_TO_LODESTONE,
    USE_SMITHING_TABLE,
    EQUIP_NETHERITE,
    AMBIENT_LOOP_WARPED_FOREST,
    AMBIENT_LOOP_SOULSAND_VALLEY,
    AMBIENT_LOOP_NETHER_WASTES,
    AMBIENT_LOOP_BASALT_DELTAS,
    AMBIENT_LOOP_CRIMSON_FOREST,
    AMBIENT_ADDITION_WARPED_FOREST,
    AMBIENT_ADDITION_SOULSAND_VALLEY,
    AMBIENT_ADDITION_NETHER_WASTES,
    AMBIENT_ADDITION_BASALT_DELTAS,
    AMBIENT_ADDITION_CRIMSON_FOREST,
    SCULK_SENSOR_POWER_ON,
    SCULK_SENSOR_POWER_OFF,
    BUCKET_FILL_POWDER_SNOW,
    BUCKET_EMPTY_POWDER_SNOW,
    POINTED_DRIPSTONE_CAULDRON_DRIP_WATER,
    POINTED_DRIPSTONE_CAULDRON_DRIP_LAVA,
    POINTED_DRIPSTONE_DRIP_WATER,
    POINTED_DRIPSTONE_DRIP_LAVA,
    CAVE_VINES_PICK_BERRIES,
    BIG_DRIPLEAF_TILT_DOWN,
    BIG_DRIPLEAF_TILT_UP,
    COPPER_WAX_ON,
    COPPER_WAX_OFF,
    SCRAPE,
    PLAYER_HURT_DROWN,
    PLAYER_HURT_ON_FIRE,
    PLAYER_HURT_FREEZE,
    USE_SPYGLASS,
    STOP_USING_SPYGLASS,
    AMETHYST_BLOCK_CHIME,
    AMBIENT_SCREAMER,
    HURT_SCREAMER,
    DEATH_SCREAMER,
    MILK_SCREAMER,
    JUMP_TO_BLOCK,
    PRE_RAM,
    PRE_RAM_SCREAMER,
    RAM_IMPACT,
    RAM_IMPACT_SCREAMER,
    SQUID_INK_SQUIRT,
    GLOW_SQUID_INK_SQUIRT,
    CONVERT_TO_STRAY,
    CAKE_ADD_CANDLE,
    EXTINGUISH_CANDLE,
    AMBIENT_CANDLE,
    BLOCK_CLICK,
    BLOCK_CLICK_FAIL,
    SCULK_CATALYST_BLOOM,
    SCULK_SHRIEKER_SHRIEK,
    WARDEN_NEARBY_CLOSE,
    WARDEN_NEARBY_CLOSER,
    WARDEN_NEARBY_CLOSEST,
    WARDEN_SLIGHTLY_ANGRY,
    RECORD_OTHERSIDE,
    UNDEFINED
}
