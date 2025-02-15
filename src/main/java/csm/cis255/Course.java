package csm.cis255;

import java.util.Arrays;

public class Course {
    // TODO: any other variables you think are helpful
    private String name;
    private Student[] roster;
    private Student[] waitlist;
    private int maximumStudentsOnRoster;
    private int maximumStudentsOnWaitlist;

    public Course(String name, int maximumStudentsOnRoster, int maximumStudentsOnWaitlist) {
        this.name = name;
        this.maximumStudentsOnRoster = maximumStudentsOnRoster;
        this.maximumStudentsOnWaitlist = maximumStudentsOnWaitlist;
        this.roster = new Student[maximumStudentsOnRoster];
        this.waitlist = new Student[maximumStudentsOnWaitlist];
    }

    @Override
    public String toString() {
        return "Course:\n" +
                "\tName: " + name + "\n" +
                "\tCurrent amount of Students on Roster: " + this.roster.length + "\n" +
                "\tMaximum amount of Students on Roster: " + maximumStudentsOnRoster + "\n" +
                "\tRoster: " + Arrays.toString(roster) + "\n" +
                "\tCurrent amount of Students on Waitlist: " + maximumStudentsOnWaitlist + "\n" +
                "\tMaximum amount of Students on Waitlist: " + maximumStudentsOnWaitlist + "\n" +
                "\tWaitlist: " + Arrays.toString(waitlist);
    }
}
