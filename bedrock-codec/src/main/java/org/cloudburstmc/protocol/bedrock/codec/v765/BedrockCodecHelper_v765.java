package org.cloudburstmc.protocol.bedrock.codec.v765;

import io.netty.buffer.ByteBuf;
import org.cloudburstmc.protocol.bedrock.codec.EntityDataTypeMap;
import org.cloudburstmc.protocol.bedrock.codec.v729.BedrockCodecHelper_v729;
import org.cloudburstmc.protocol.bedrock.data.Ability;
import org.cloudburstmc.protocol.bedrock.data.inventory.ContainerSlotType;
import org.cloudburstmc.protocol.bedrock.data.inventory.itemstack.request.TextProcessingEventOrigin;
import org.cloudburstmc.protocol.bedrock.data.inventory.itemstack.request.action.ItemStackRequestActionType;
import org.cloudburstmc.protocol.common.util.TypeMap;
import org.cloudburstmc.protocol.common.util.VarInts;

import java.math.BigInteger;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class BedrockCodecHelper_v765 extends BedrockCodecHelper_v729 {

    public BedrockCodecHelper_v765(EntityDataTypeMap entityData, TypeMap<Class<?>> gameRulesTypes, TypeMap<ItemStackRequestActionType> stackRequestActionTypes,
                                   TypeMap<ContainerSlotType> containerSlotTypes, TypeMap<Ability> abilities, TypeMap<TextProcessingEventOrigin> textProcessingEventOrigins) {
        super(entityData, gameRulesTypes, stackRequestActionTypes, containerSlotTypes, abilities, textProcessingEventOrigins);
    }

    @Override
    public <T extends Enum<?>> void readLargeVarIntFlags(ByteBuf buffer, Set<T> flags, Class<T> clazz) {
        BigInteger flagsInt = VarInts.readUnsignedBigVarInt(buffer);
        for (T flag : clazz.getEnumConstants()) {
            if (flagsInt.testBit(flag.ordinal())) {
                flags.add(flag);
            }
        }
    }

    @Override
    public <T extends Enum<?>> void writeLargeVarIntFlags(ByteBuf buffer, Set<T> flags, Class<T> clazz) {
        BigInteger flagsInt = new BigInteger(clazz.getEnumConstants().length, ThreadLocalRandom.current());
        for (T flag : flags) {
            flagsInt = flagsInt.setBit(flag.ordinal());
        }
        VarInts.writeUnsignedBigVarInt(buffer, flagsInt);
    }
}
