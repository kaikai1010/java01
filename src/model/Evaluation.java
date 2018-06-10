package model;

public class Evaluation implements java.io.Serializable {
	private int like = 0;
	private int dislike = 0;

	public Evaluation() {}

	public void setLike(int like) {
		this.like = like;
	}
	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	public int getLike() {
		return like;
	}
	public int getDislike() {
		return dislike;
	}

}
