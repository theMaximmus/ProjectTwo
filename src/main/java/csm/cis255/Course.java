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
        this.roster = new Student[0];
        this.waitlist = new Student[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getRoster() {
        return roster;
    }

    // There is no need for setRoster() method as we won't directly change a list of students on the roaster
    // with a different one (that's already assembled)

    public Student[] getWaitlist() {
        return waitlist;
    }

    // There is no need for setWaitlist() method as we won't directly change a list of students on the waitlist
    // with a different one (that's already assembled)

    public int getMaximumStudentsOnRoster() {
        return maximumStudentsOnRoster;
    }

    public void setMaximumStudentsOnRoster(int maximumStudentsOnRoster) {
        this.maximumStudentsOnRoster = maximumStudentsOnRoster;
    }

    public int getMaximumStudentsOnWaitlist() {
        return maximumStudentsOnWaitlist;
    }

    public void setMaximumStudentsOnWaitlist(int maximumStudentsOnWaitlist) {
        this.maximumStudentsOnWaitlist = maximumStudentsOnWaitlist;
    }

    public int getCurrentStudentsEnrolled() {
        return this.roster.length;
    }

    public int getCurrentStudentsOnWaitlist() {
        return this.waitlist.length;
    }

    // TODO: Finish the method
    @Override
    public String toString() {
        return "Course:\n" +
                "\tName: " + name + "\n" +
                "\tCurrent amount of Students on Roster: " + this.getCurrentStudentsEnrolled() + "\n" +
                "\tMaximum amount of Students on Roster: " + maximumStudentsOnRoster + "\n" +
                "\tRoster: " + Arrays.toString(roster) + "\n" +
                "\tCurrent amount of Students on Waitlist: " + this.getCurrentStudentsOnWaitlist() + "\n" +
                "\tMaximum amount of Students on Waitlist: " + maximumStudentsOnWaitlist + "\n" +
                "\tWaitlist: " + Arrays.toString(waitlist);
    }
}
