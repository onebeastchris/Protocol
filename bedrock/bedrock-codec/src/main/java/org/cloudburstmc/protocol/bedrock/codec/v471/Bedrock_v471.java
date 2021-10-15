package org.cloudburstmc.protocol.bedrock.codec.v471;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodec;
import org.cloudburstmc.protocol.bedrock.codec.v465.BedrockCodecHelper_v465;
import org.cloudburstmc.protocol.bedrock.codec.v465.Bedrock_v465;
import org.cloudburstmc.protocol.bedrock.codec.v471.serializer.*;
import org.cloudburstmc.protocol.bedrock.data.LevelEvent;
import org.cloudburstmc.protocol.bedrock.data.LevelEventType;
import org.cloudburstmc.protocol.bedrock.data.ParticleType;
import org.cloudburstmc.protocol.bedrock.data.SoundEvent;
import org.cloudburstmc.protocol.bedrock.data.inventory.stackrequestactions.StackRequestActionType;
import org.cloudburstmc.protocol.bedrock.packet.*;
import org.cloudburstmc.protocol.common.util.TypeMap;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bedrock_v471 extends Bedrock_v465 {

    protected static final TypeMap<StackRequestActionType> ITEM_STACK_REQUEST_TYPES = Bedrock_v465.ITEM_STACK_REQUEST_TYPES.toBuilder()
            .shift(14, 2)
            .insert(14, StackRequestActionType.CRAFT_REPAIR_AND_DISENCHANT)
            .insert(15, StackRequestActionType.CRAFT_LOOM)
            .build();

    protected static final TypeMap<LevelEventType> LEVEL_EVENTS = Bedrock_v465.LEVEL_EVENTS.toBuilder()
            .insert(LEVEL_EVENT_PARTICLE + 36, LevelEvent.SCULK_CATALYST_BLOOM)
            .insert(LEVEL_EVENT_PARTICLE_TYPE + 83, ParticleType.SCULK_SOUL)
            .build();

    protected static final TypeMap<SoundEvent> SOUND_EVENTS = Bedrock_v465.SOUND_EVENTS.toBuilder()
            .insert(365, SoundEvent.SCULK_CATALYST_BLOOM)
            .build();

    public static final BedrockCodec CODEC = Bedrock_v465.CODEC.toBuilder()
            .protocolVersion(471)
            .minecraftVersion("1.17.40")
            .helper(() -> new BedrockCodecHelper_v465(ENTITY_DATA, ENTITY_DATA_TYPES, ENTITY_FLAGS, GAME_RULE_TYPES, ITEM_STACK_REQUEST_TYPES))
            .updateSerializer(EventPacket.class, EventSerializer_v471.INSTANCE)
            .registerPacket(SubChunkPacket.class, SubChunkSerializer_v471.INSTANCE, 174)
            .registerPacket(SubChunkRequestPacket.class, SubChunkRequestSerializer_v471.INSTANCE, 175)
            .build();
}
