package org.cloudburstmc.protocol.bedrock.packet;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.cloudburstmc.math.vector.Vector2f;
import org.cloudburstmc.math.vector.Vector3f;
import org.cloudburstmc.math.vector.Vector4f;
import org.cloudburstmc.protocol.bedrock.data.AttributeData;
import org.cloudburstmc.protocol.bedrock.data.entity.EntityDataMap;
import org.cloudburstmc.protocol.bedrock.data.entity.EntityLinkData;
import org.cloudburstmc.protocol.common.PacketSignal;

import java.util.List;

@Data
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AddEntityPacket implements BedrockPacket {
    private final List<AttributeData> attributes = new ObjectArrayList<>();
    private final EntityDataMap metadata = new EntityDataMap();
    private final List<EntityLinkData> entityLinks = new ObjectArrayList<>();
    private long uniqueEntityId;
    private long runtimeEntityId;
    private String identifier;
    private int entityType;
    private Vector3f position;
    private Vector3f motion;
    private Vector2f rotation;
    /**
     * @since v534
     */
    private float headRotation;
    /**
     * @since v534
     */
    private float bodyRotation;

    @Override
    public final PacketSignal handle(BedrockPacketHandler handler) {
        return handler.handle(this);
    }

    public BedrockPacketType getPacketType() {
        return BedrockPacketType.ADD_ENTITY;
    }
}
