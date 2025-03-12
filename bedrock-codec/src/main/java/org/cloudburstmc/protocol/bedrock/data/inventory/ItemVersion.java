package org.cloudburstmc.protocol.bedrock.data.inventory;
import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum ItemVersion {
    LEGACY,
    DATA_DRIVEN,
    NONE;

    private static final ItemVersion[] VALUES = values();

    public static ItemVersion from(int ordinal) {
        return NullableEnum.get(VALUES, ordinal);
    }
}
