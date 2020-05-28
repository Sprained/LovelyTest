package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.middlewares.AuthMiddleware;
import test.middlewares.OngMiddlewares;
import test.sessions.Session;
import test.sessions.SessionLogout;
import test.users.Users;

@RunWith(Suite.class)
@SuiteClasses({
	AuthMiddleware.class,
	Users.class,
	Session.class,
	OngMiddlewares.class,
	SessionLogout.class
})

public class SuiteMiddleware {

}
