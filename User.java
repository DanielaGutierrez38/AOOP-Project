/**
 * Class that represents a User. Parent of Scientist, Space Agency Representative, and Administrator
 * @author Caitlin Gregory
 * @author Daniela Gutierrez
 */
public abstract class User {

    protected String username;
    protected String passwordHash;
    protected String salt;

    /**Default constructor */
    User(){}

    /**User constructor
     * @param username user's username
     * @param passwordHash hashing for the user's password
     * @param salt salt for the user's password
     */
    public User(String username, String passwordHash, String salt) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    /**Getter for username
     * @return String with the user's username
     */
    public String getUsername(){ 
        return username; 
    }

    /**
     * @return String with password hash
     */
    public String getPasswordHash(){
        return passwordHash; 
    }
    
    /**
     * @return String with password salt
     * @return
     */
    public String getSalt(){ 
        return salt; 
    }

    /**
     * Method to get the user's type (i. e. Scientist, SpaceAgentRep, Administrator)
     * @return String with the user type
     */
    public abstract String getUserType(); 
}