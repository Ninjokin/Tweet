package tk.ninjokin.tweet.event;

import org.bukkit.event.Event;

import tk.ninjokin.tweet.util.Tweet;
import tk.ninjokin.tweet.util.Util;

public class TweetEvent extends Event {

	public TweetEvent(String event, int tweetID) {
		super(event);
		
		tweetID = this.tweetID;
	}
	
	public Tweet getTweet() {
		return u.getTweetFromID(tweetID);
	}
	
	private int tweetID;
	
	private Util u = new Util();
	
	private static final long serialVersionUID = -6831651547473765974L;
}