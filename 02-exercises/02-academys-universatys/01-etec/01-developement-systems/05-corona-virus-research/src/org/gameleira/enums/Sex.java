package org.gameleira.enums;

public enum Sex {
    MASCULINE(0),
    FEMININE(1);

    private final int code;

    Sex(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    public static Sex fromCode(int code) {
        for (Sex sex : Sex.values()) {
            if (sex.getCode() == code) {
                return sex;
            }
        }
        throw new IllegalArgumentException("Codigo de sexo invalido: " + code);
    }
}
