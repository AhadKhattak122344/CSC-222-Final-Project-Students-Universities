public class University implements Comparable<University> {
    private final String universityName;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final String zip;
    private final String phoneNumber;
    private final double inStateTuitionPerCreditUpTo12;
    private final double inStateTuitionPerCredit12To18;
    private final double inStateTuitionPerCreditOver18;
    private final double outOfStateTuitionPerCreditUpTo12;
    private final double outOfStateTuitionPerCredit12To18;
    private final double outOfStateTuitionPerCreditOver18;
    private final double lateFees;
    private final double incidentalFees;
    private final double optionalHealthCarePerCredit;
    private final double mealPlanA;
    private final double mealPlanB;
    private final double mealPlanC;

    public University(String universityName, String streetAddress, String city, String state, String zip,
                      String phoneNumber, double inStateTuitionPerCreditUpTo12, double inStateTuitionPerCredit12To18,
                      double inStateTuitionPerCreditOver18, double outOfStateTuitionPerCreditUpTo12,
                      double outOfStateTuitionPerCredit12To18, double outOfStateTuitionPerCreditOver18,
                      double lateFees, double incidentalFees, double optionalHealthCarePerCredit,
                      double mealPlanA, double mealPlanB, double mealPlanC) {
        this.universityName = universityName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.inStateTuitionPerCreditUpTo12 = inStateTuitionPerCreditUpTo12;
        this.inStateTuitionPerCredit12To18 = inStateTuitionPerCredit12To18;
        this.inStateTuitionPerCreditOver18 = inStateTuitionPerCreditOver18;
        this.outOfStateTuitionPerCreditUpTo12 = outOfStateTuitionPerCreditUpTo12;
        this.outOfStateTuitionPerCredit12To18 = outOfStateTuitionPerCredit12To18;
        this.outOfStateTuitionPerCreditOver18 = outOfStateTuitionPerCreditOver18;
        this.lateFees = lateFees;
        this.incidentalFees = incidentalFees;
        this.optionalHealthCarePerCredit = optionalHealthCarePerCredit;
        this.mealPlanA = mealPlanA;
        this.mealPlanB = mealPlanB;
        this.mealPlanC = mealPlanC;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getInStateTuitionPerCreditUpTo12() {
        return inStateTuitionPerCreditUpTo12;
    }

    public double getInStateTuitionPerCredit12To18() {
        return inStateTuitionPerCredit12To18;
    }

    public double getInStateTuitionPerCreditOver18() {
        return inStateTuitionPerCreditOver18;
    }

    public double getOutOfStateTuitionPerCreditUpTo12() {
        return outOfStateTuitionPerCreditUpTo12;
    }

    public double getOutOfStateTuitionPerCredit12To18() {
        return outOfStateTuitionPerCredit12To18;
    }

    public double getOutOfStateTuitionPerCreditOver18() {
        return outOfStateTuitionPerCreditOver18;
    }

    public double getLateFees() {
        return lateFees;
    }

    public double getIncidentalFees() {
        return incidentalFees;
    }

    public double getOptionalHealthCarePerCredit() {
        return optionalHealthCarePerCredit;
    }

    public double getMealPlanA() {
        return mealPlanA;
    }

    public double getMealPlanB() {
        return mealPlanB;
    }

    public double getMealPlanC() {
        return mealPlanC;
    }

    @Override
    public int compareTo(University other) {
        return universityName.compareTo(other.universityName);
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", inStateTuitionPerCreditUpTo12=" + inStateTuitionPerCreditUpTo12 +
                ", inStateTuitionPerCredit12To18=" + inStateTuitionPerCredit12To18 +
                ", inStateTuitionPerCreditOver18=" + inStateTuitionPerCreditOver18 +
                ", outOfStateTuitionPerCreditUpTo12=" + outOfStateTuitionPerCreditUpTo12 +
                ", outOfStateTuitionPerCredit12To18=" + outOfStateTuitionPerCredit12To18 +
                ", outOfStateTuitionPerCreditOver18=" + outOfStateTuitionPerCreditOver18 +
                ", lateFees=" + lateFees +
                ", incidentalFees=" + incidentalFees +
                ", optionalHealthCarePerCredit=" + optionalHealthCarePerCredit +
                ", mealPlanA=" + mealPlanA +
                ", mealPlanB=" + mealPlanB +
                ", mealPlanC=" + mealPlanC +
                '}';
    }
}
