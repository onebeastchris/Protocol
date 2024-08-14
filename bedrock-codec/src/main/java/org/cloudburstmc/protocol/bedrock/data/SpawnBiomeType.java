package org.cloudburstmc.protocol.bedrock.data;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum SpawnBiomeType {
    DEFAULT,
    USER_DEFINED;
    
    private static final SpawnBiomeType[] VALUES = values();

    public static SpawnBiomeType byId(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
