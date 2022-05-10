package com.teb.training.java.common;


public enum EGender {

    MALE("Erkek tipi") {

        @Override
        public String xyz() {

            return "Erkek @Override";
        }
    },
    FEMALE("Kadın tipi") {

        @Override
        public String xyz() {
            return "Kadın @Override";
        }
    };

    private final String desc;

    private EGender(String descParam) {
        desc = descParam;
    }

    public String getDesc() {
        return desc;
    }

    public String xyz() {
        return "Unkown";
    }

}
