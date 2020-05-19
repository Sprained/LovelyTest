package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.Session;
import test.SessionExceptions;
import test.Users;
import test.UsersExceptions;

@RunWith(Suite.class)
@SuiteClasses({
	Users.class,
	UsersExceptions.class,
	Session.class,
	SessionExceptions.class
})

public class SuiteNode {
	
}
