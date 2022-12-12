import java.time.Year;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    private String jobTitle;
    Human (int yearOfBirth, String name, String town, String jobTitle){
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null || name == "") {
            this.name = " Please write information";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = " Please write information";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
            jobTitle = " Please write information";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
            return this.yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return "Hi! My name is " + getName() + ". I am from " + getTown() + ". I was born in "
                + getYearOfBirth() + " year. I am working as " + getJobTitle() + ". Nice to meet you! " ;
    }

}
