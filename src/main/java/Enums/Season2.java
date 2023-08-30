package Enums;

public enum Season2 {
    WINTER {
        public String toString() { return "Winter - cold season"; }
    },
    SPRING {
        public String toString() { return "Spring - cold-warm season"; }
    },
    SUMMER {
        public String toString() { return "Summer - hot season"; }
    },
    FALL {
        public String toString() { return "Fall - cool season"; }
    }
}
