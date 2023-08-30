package Enums;

public enum DocumentStatus {
    NEW(31),
    DRAFT(23),
    PUBLISHED(52),
    ARCHIVED(77);

    private int statusCode;

    private DocumentStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
