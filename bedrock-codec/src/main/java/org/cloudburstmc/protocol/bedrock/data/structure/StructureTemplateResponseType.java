package org.cloudburstmc.protocol.bedrock.data.structure;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum StructureTemplateResponseType {
    NONE,
    EXPORT,
    QUERY,
    /**
     * @since v560
     */
    IMPORT;

    private static final StructureTemplateResponseType[] VALUES = StructureTemplateResponseType.values();

    public static StructureTemplateResponseType from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
