import java.util.ArrayList;

public class User {
    public String username;
    public String password;
    public int points;
    public enum userType{
        PLAYER, QUIZCREATOR
    };

    public userType type;

    // Stores all the users in the program
    public static ArrayList<User> userArray = new ArrayList<User>();

    // Person playing the game
    public void user(String username, String password, userType ut){
        this.username = username;
        this.password = password;
        type = ut;

        if(ut == userType.PLAYER){
            this.points = 0;
        }
        // this.points = 0;
    }

    /*
    public user(){
        points = 0;
    }
    */


    // Person who can log in, create a quiz, view quizzes they've created...
    public void QuizCreator(String username, String password){
        this.username = username;
        this.password = password;
    }


    // Set & Get methods
    public String getUsername(){ return username; }
    public void setUsername(String newUsername){
        username = newUsername;
    }
    public String getPassword(){ return password; }
    public void setPassword(String newPassword){
        password = newPassword;
    }
    public int getPoints() { return points; };
    public void setPoints(int newPoints) { points = newPoints; }

    public userType getType(){ return type; }
    public void setType(userType newType) { type = newType; }

}
