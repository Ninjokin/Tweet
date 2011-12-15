package tk.ninjokin.tweet.util;

import java.util.logging.Logger;

public class Util {
	
	/**
	 * Gets tweet from ID
	 * @param ID
	 * @return Tweet
	 * @throws TweetNotFoundException
	 */
	public Tweet getTweetFromID(int ID) {
			return twtt.getTweetFromString(twt.getString("tweets." + ID));
	}
	
	/**
	 * Logs the message to the Minecraft console.
	 * @param msg
	 */
	public void Log(String msg) {
		Log.info("[Tweet] " + msg);
	}
	
	/*
	 * Declare variables here.
	 */
	private Logger Log = Logger.getLogger("Minecraft");
	private tk.ninjokin.tweet.Tweet twt = new tk.ninjokin.tweet.Tweet();
	private Tweet twtt = new Tweet();
}