package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.cats.CreateCat;
import test.cats.ListCats;
import test.dogs.CreateDog;
import test.dogs.ListDogs;
import test.ongs.Ongs;
import test.ongs.OngsExceptions;
import test.search.Search;
import test.sessions.Session;
import test.sessions.SessionExceptions;
import test.sessions.SessionLogout;
import test.sessions.SessionOng;
import test.users.Users;
import test.users.UsersExceptions;

@RunWith(Suite.class)
@SuiteClasses({
	Users.class,
	UsersExceptions.class,
	Session.class,
	SessionExceptions.class,
	SessionLogout.class,
	Ongs.class,
	OngsExceptions.class,
	SessionOng.class,
	CreateDog.class,
	ListDogs.class,
	CreateCat.class,
	ListCats.class,
	Search.class,
	SessionLogout.class
})

public class SuiteNode {
	
}
