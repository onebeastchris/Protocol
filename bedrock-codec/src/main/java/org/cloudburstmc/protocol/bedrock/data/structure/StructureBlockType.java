package org.cloudburstmc.protocol.bedrock.data.structure;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum StructureBlockType {
    DATA,
    SAVE,
    LOAD,
    CORNER,
    INVALID,
    EXPORT;

    private static final StructureBlockType[] VALUES = StructureBlockType.values();

    public static StructureBlockType from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
