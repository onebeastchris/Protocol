package org.cloudburstmc.protocol.bedrock.codec.v765.serializer;

import io.netty.buffer.ByteBuf;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.v748.serializer.ResourcePacksInfoSerializer_v748;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePacksInfoPacket;

public class ResourcePacksInfoSerializer_v765 extends ResourcePacksInfoSerializer_v748 {
    public static final ResourcePacksInfoSerializer_v765 INSTANCE = new ResourcePacksInfoSerializer_v765();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, ResourcePacksInfoPacket packet) {
        buffer.writeBoolean(packet.isForcedToAccept());
        buffer.writeBoolean(packet.isHasAddonPacks());
        buffer.writeBoolean(packet.isScriptingEnabled());
        helper.writeUuid(buffer, packet.getWorldTemplateId());
        helper.writeString(buffer, packet.getWorldTemplateVersion());
        writePacks(buffer, packet.getResourcePackInfos(), helper, true);
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, ResourcePacksInfoPacket packet) {
        packet.setForcedToAccept(buffer.readBoolean());
        packet.setHasAddonPacks(buffer.readBoolean());
        packet.setScriptingEnabled(buffer.readBoolean());
        packet.setWorldTemplateId(helper.readUuid(buffer));
        packet.setWorldTemplateVersion(helper.readString(buffer));
        readPacks(buffer, packet.getResourcePackInfos(), helper, true);
    }
}