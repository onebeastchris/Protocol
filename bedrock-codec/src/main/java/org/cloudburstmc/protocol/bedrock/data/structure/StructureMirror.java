package org.cloudburstmc.protocol.bedrock.data.structure;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum StructureMirror {
    NONE,
    X,
    Z,
    XZ;

    private static final StructureMirror[] VALUES = StructureMirror.values();

    public static StructureMirror from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
