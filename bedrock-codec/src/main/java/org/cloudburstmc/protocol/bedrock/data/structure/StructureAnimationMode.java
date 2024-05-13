package org.cloudburstmc.protocol.bedrock.data.structure;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum StructureAnimationMode {
    NONE,
    LAYER,
    BLOCKS;

    private static final StructureAnimationMode[] VALUES = StructureAnimationMode.values();

    public static StructureAnimationMode from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
