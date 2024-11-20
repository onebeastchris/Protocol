package org.cloudburstmc.protocol.bedrock.codec.v765.serializer;

import io.netty.buffer.ByteBuf;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.v729.serializer.CameraAimAssistSerializer_v729;
import org.cloudburstmc.protocol.bedrock.packet.CameraAimAssistPacket;

public class CameraAimAssistSerializer_v765 extends CameraAimAssistSerializer_v729 {
    public static final CameraAimAssistSerializer_v765 INSTANCE = new CameraAimAssistSerializer_v765();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, CameraAimAssistPacket packet) {
        helper.writeString(buffer, packet.getPresetId());
        super.serialize(buffer, helper, packet);
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, CameraAimAssistPacket packet) {
        packet.setPresetId(helper.readString(buffer));
        super.deserialize(buffer, helper, packet);
    }
}