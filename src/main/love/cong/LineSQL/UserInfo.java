package main.love.cong.LineSQL;

public class UserInfo {
    private String id;
    private String name;
    private String age;
    private String gender;
    private String domicile;
    private String specialized;

    public UserInfo(String id, String name, String age, String gender, String domicile, String specialized) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.domicile = domicile;
        this.specialized = specialized;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getAge() { return age; }
    public String getGender() { return gender; }
    public String getDomicile() { return domicile; }
    public String getSpecialized() { return specialized; }
}
