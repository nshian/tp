package seedu.duke.user;


import seedu.duke.exceptions.InvalidUserCommandException;

/**
 * Class to store the interested modules that a user is for a particular university.
 */

public class UserUniversityList {
    private UserModuleMappingList myModules;
    private String universityName;
    private String universityCountry;

    public String getUniversityCountry() {
        return universityCountry;
    }

    public UserUniversityList(String universityName) {
        this.universityName = universityName;
        this.myModules = new UserModuleMappingList();
    }

    public void addModule(UserModuleMapping input) {
        myModules.addModule(input);
    }

    /**
     * Method to delete module based on puCode.
     * @param puCode input puCode
     * @throws InvalidUserCommandException If puCode does not exist in the list
     */
    public void deleteModuleByPuCode(String puCode) throws InvalidUserCommandException {
        assert puCode.length() > 0 : "Deleting PU code cannot be empty";
        myModules.deleteModuleByPuCode(puCode);
    }

    public void deleteModule(int index) {
        myModules.deleteModule(index);
    }

    public void displayModules() {
        myModules.displayAll();
    }

    public UserModuleMappingList getMyModules() {
        return myModules;
    }

    public void setMyModules(UserModuleMappingList myModules) {
        this.myModules = myModules;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
