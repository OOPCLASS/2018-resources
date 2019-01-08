
public class Application {

	public static void main(String[] args) {
		UserService userService = new UserService();

		User user = new User();
		user.setUsername("hey");
		user.setPassword("password");

		userService.save(user);


		userService.findAll().stream().map(User::getUsername).forEach(System.out::println);
	}

}
