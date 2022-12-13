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
        if (name == null || name.isEmpty()) {
            this.name = " Please write information";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = " Please write information";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            jobTitle = " Please write information";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
            return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = " Please write information";
        } else {
            this.name = name;
        }
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) {
            this.town = " Please write information";
        } else {
            this.town = town;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty()) {
            jobTitle = " Please write information";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String toString() {
        return "Hi! My name is " + getName() + ". I am from " + getTown() + ". I was born in "
                + getYearOfBirth() + " year. I am working as " + getJobTitle() + ". Nice to meet you! " ;
    }

}
