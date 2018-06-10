package model;

public class EvaluationLogic {
	public void executeLike(Evaluation e) {
		int like = e.getLike();
		e.setLike(like + 1);
	}

	public void executeDislike(Evaluation e) {
		int dislike = e.getDislike();
		e.setDislike(dislike + 1);
	}

}
