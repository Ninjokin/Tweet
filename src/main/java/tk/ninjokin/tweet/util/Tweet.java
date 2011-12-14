package tk.ninjokin.tweet.util;

public class Tweet {

	public Tweet getTweetFromString(String tweet) {
		return Tweet.class.cast(tweet);
	}
}