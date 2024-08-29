package com.beemdevelopment.aegis;

public enum BackupVersioningStrategy {
    MULTIPLE_FILES(0),
    SINGLE_FILE(1);

    private final int _value;

    BackupVersioningStrategy(int value) {
        _value = value;
    }

    public int getValue() {
        return _value;
    }

    public static BackupVersioningStrategy valueOf(int value) {
        switch (value) {
            case 0:
                return MULTIPLE_FILES;
            case 1:
                return SINGLE_FILE;
            default:
                return null;
        }
    }
}