package microservice.book.socialmultiplication.domain;

public final class User {

	private  String alias;
	
	public User() {
		this.alias = null;
	}
	
	

	public User(String alias) {
		this.alias = alias;
	}



	public String getAlias() {
		return alias;
	}

	@Override
	public String toString() {
		return "User [alias=" + alias + "]";
	}

}
