package object;

public record PersonRecord(String name, String accupation)
{
    public static String country = "USA";
    public PersonRecord {
        if (name == null || accupation == null) {
            throw new IllegalArgumentException();
        }
    }
}
