package org.cloudburstmc.protocol.bedrock.data;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum PhotoType {
    PORTFOLIO,
    PHOTO_ITEM,
    BOOK;

    private static final PhotoType[] VALUES = values();

    public static PhotoType from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
