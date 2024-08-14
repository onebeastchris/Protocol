package org.cloudburstmc.protocol.bedrock.data.skin;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum AnimationExpressionType {
    LINEAR,
    BLINKING;

    private static final AnimationExpressionType[] VALUES = values();

    public static AnimationExpressionType from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
