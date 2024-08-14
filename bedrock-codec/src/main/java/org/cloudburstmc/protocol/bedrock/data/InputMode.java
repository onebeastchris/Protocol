package org.cloudburstmc.protocol.bedrock.data;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum InputMode {
    UNDEFINED,
    MOUSE,
    TOUCH,
    GAMEPAD,
    MOTION_CONTROLLER;

    private static final InputMode[] VALUES = values();

    public static InputMode from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
