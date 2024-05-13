package org.cloudburstmc.protocol.bedrock.data;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum GamePublishSetting {
    NO_MULTI_PLAY,
    INVITE_ONLY,
    FRIENDS_ONLY,
    FRIENDS_OF_FRIENDS,
    PUBLIC;

    public static GamePublishSetting byId(int id) {
        return NullableEnum.get(values(), id);
    }
}
