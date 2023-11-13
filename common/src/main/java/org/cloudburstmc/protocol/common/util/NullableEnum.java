package org.cloudburstmc.protocol.common.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NullableEnum {
    public static <E extends Enum<E>> E get(E[] enumValues, int index) {
        if (index >= 0 && index < enumValues.length) {
            return enumValues[index];
        }
        return null;
    }
}
