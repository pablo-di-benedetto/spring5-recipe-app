package guru.springframework.domain;

public enum Difficulty {

    EASY("Easy"),
    MODERATE("Moderate"),
    KIND_OF_HARD("Kind of hard"),
    HARD("Hard");

    private final String description;

    Difficulty(String s) {
        description = s;
    }

    @Override
    public String toString(){
        return description;
    }
}
