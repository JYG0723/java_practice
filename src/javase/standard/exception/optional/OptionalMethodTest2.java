package javase.standard.exception.optional;

import java.util.Objects;
import java.util.Optional;

/**
 * @author Ji YongGuang.
 * @date 0:02 2018/11/20.
 * @description
 */
public class OptionalMethodTest2 {

    private static void testIfPresent(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);
        // ifPresent | isPresent
        optionalUser.ifPresent(value -> System.out.println("value :" + value));
    }

    public static User testFilter(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);
        optionalUser.filter(value -> {
            if (Objects.equals(user.getUsername(), "hikari")) {
                return true;
            }
            return false;
        });
        return optionalUser.get();
    }

    public static String testMap(User user) {
        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.map(User::getUsername).orElse("hikari");

        return optionalUser.map( (User value) -> value.getUsername()).orElse("hikaricp");
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("hikari");
        // testIfPresent(user);

        System.out.println(testMap(user));
    }
}
