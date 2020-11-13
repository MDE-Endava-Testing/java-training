package homeworks.daniel.fifthAssignment;

import com.github.javafaker.Faker;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

public class StudentFormDataModel {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private Long mobile;
    private String dateOfBirth;
    private List<String> Subjects;
    private List<String> hobbies;
    private String picturePath;
    private String currentAddress;
    private String state;
    private String city;

    private Faker fakerData = new Faker();
    public StudentFormDataModel() {
        firstName = fakerData.name().firstName();
        lastName = fakerData.name().lastName();
        email = String.format("%s.%s@gmail.com",firstName,lastName);
        gender = FakerUtils.genderSelector.get();
        mobile = fakerData.number().randomNumber(10,true);
        dateOfBirth = new SimpleDateFormat("dd MMMM yyyy").format(fakerData.date().birthday());
        Subjects = FakerUtils.listSelector.apply(FakerUtils.subjectsList);
        hobbies = FakerUtils.listSelector.apply(FakerUtils.hobbiesList);
        picturePath = new File("src/main/java/homeworks/daniel/fifthAssignment/70ec3dde6742e3606340ef1fa2562b53.gif").getAbsolutePath();
        currentAddress = fakerData.address().fullAddress();
        state = FakerUtils.selectState.get();
        city = FakerUtils.selectCity.apply(state);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Faker getFakerData() {
        return fakerData;
    }

    public void setFakerData(Faker fakerData) {
        this.fakerData = fakerData;
    }
}


