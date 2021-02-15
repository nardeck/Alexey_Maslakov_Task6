import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {

   private String login;
   private String password;

    Map<String, String> initialListUsers;

    public Users(Map<String, String> initialListusers) {
        this.initialListUsers = initialListusers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return Objects.equals(login, users.login) && Objects.equals(password, users.password) && Objects.equals(initialListUsers, users.initialListUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, initialListUsers);
    }

    @Override
    public String toString() {
        return "Users{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", initialListusers=" + initialListUsers +
                '}';
    }


    public void addNewUser(String login, String password) {
        System.out.println();
        Pattern pattern1 = Pattern.compile("\s");
        Matcher matcher1 = pattern1.matcher(login);
        Pattern pattern2 = Pattern.compile("[0-9]+");
        Matcher matcher2 = pattern2.matcher(login);
        Pattern pattern3 = Pattern.compile("[a-z]");
        Matcher matcher3 = pattern3.matcher(password);
        Pattern pattern4 = Pattern.compile("[A-Z]");
        Matcher matcher4 = pattern4.matcher(password);
        Pattern pattern5 = Pattern.compile("[0-9]");
        Matcher matcher5 = pattern5.matcher(password);
        Pattern pattern6 = Pattern.compile("[а-яА-Я]");
        Matcher matcher6 = pattern6.matcher(login);
        Pattern pattern7 = Pattern.compile("[а-яА-Я]");
        Matcher matcher7 = pattern7.matcher(password);


        if (matcher1.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " - имя пользователя не должно содержать пробелов, замените их на _");
            return;
        }
        if (matcher2.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " -имя пользователя не должно содержать цифр, уберите их");
            return;
        }
        if (matcher6.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " -используйте только латинский алфавит");
            return;
        }
        if (!matcher3.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " -пароль обязан содержать символы  нижнего регистра");
            return;
        }
        if (!matcher4.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " -пароль обязан содержать символы верхнего регистра");
            return;
        }
        if (!matcher5.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " -пароль обязан содержать цифры");
            return;
        }
        if (matcher7.find()) {
            System.out.println("Пользователь " + login + " не добавлен" + " -используйте только латинский алфавит");
            return;
        }
        if ((initialListUsers.containsKey(login))) {
            System.out.println("Пользователь " + login + " не добавлен" + " - такое имя уже существует");
            return;
        }
        initialListUsers.put(login, password);
        System.out.println("Добавлен новый пользователь - " + login);
        System.out.println();

    }

    public void removeUser(String login) {
        System.out.println();
        initialListUsers.remove(login);
        System.out.println("Пользователь с ником " + login + " удален");
        System.out.println();
    }
}
