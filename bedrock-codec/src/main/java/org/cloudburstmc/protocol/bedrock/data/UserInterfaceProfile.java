package org.cloudburstmc.protocol.bedrock.data;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum UserInterfaceProfile {

    CLASSIC,
    POCKET,
    NONE;

    private static final UserInterfaceProfile[] VALUES = values();

    public static UserInterfaceProfile from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
