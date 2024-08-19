public class Student extends Person {
  private final String studentID;
  private String universityName;
  private int creditsEnrolled;
  private String qualifiesForInstateRate;
  private String lateFeeAssessed;
  private String foodOptionChoice;
  private String healthOptionChoice;

  public Student(Name name, int age, char gender, String streetAddress, String city, String state, String zip, String phoneNumber,
                 String studentID, String universityName, int creditsEnrolled, String qualifiesForInstateRate, String lateFeeAssessed,
                 String foodOptionChoice, String healthOptionChoice) {
      super(name, age, gender, streetAddress, city, state, zip, phoneNumber);
      this.studentID = studentID;
      this.universityName = universityName;
      this.creditsEnrolled = creditsEnrolled;
      this.qualifiesForInstateRate = qualifiesForInstateRate;
      this.lateFeeAssessed = lateFeeAssessed;
      this.foodOptionChoice = foodOptionChoice;
      this.healthOptionChoice = healthOptionChoice;
  }

  public String getStudentID() {
      return studentID;
  }

  public String getUniversityName() {
      return universityName;
  }

  public void setUniversityName(String universityName) {
      this.universityName = universityName;
  }

  public int getCreditsEnrolled() {
      return creditsEnrolled;
  }

  public void setCreditsEnrolled(int creditsEnrolled) {
      this.creditsEnrolled = creditsEnrolled;
  }

  public String getQualifiesForInstateRate() {
      return qualifiesForInstateRate;
  }

  public void setQualifiesForInstateRate(String qualifiesForInstateRate) {
      this.qualifiesForInstateRate = qualifiesForInstateRate;
  }

  public String getLateFeeAssessed() {
      return lateFeeAssessed;
  }

  public void setLateFeeAssessed(String lateFeeAssessed) {
      this.lateFeeAssessed = lateFeeAssessed;
  }

  public String getFoodOptionChoice() {
      return foodOptionChoice;
  }

  public void setFoodOptionChoice(String foodOptionChoice) {
      this.foodOptionChoice = foodOptionChoice;
  }

  public String getHealthOptionChoice() {
      return healthOptionChoice;
  }

  public void setHealthOptionChoice(String healthOptionChoice) {
      this.healthOptionChoice = healthOptionChoice;
  }

  @Override
  public String toString() {
      return "Student{" +
              "name=" + getName() +
              ", studentID='" + studentID + '\'' +
              ", universityName='" + universityName + '\'' +
              ", creditsEnrolled=" + creditsEnrolled +
              ", qualifiesForInstateRate='" + qualifiesForInstateRate + '\'' +
              ", lateFeeAssessed='" + lateFeeAssessed + '\'' +
              ", foodOptionChoice='" + foodOptionChoice + '\'' +
              ", healthOptionChoice='" + healthOptionChoice + '\'' +
              '}';
  }
}
