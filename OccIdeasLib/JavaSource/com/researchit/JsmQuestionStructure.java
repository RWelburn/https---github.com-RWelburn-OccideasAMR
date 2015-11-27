package com.researchit;

import com.researchit.common.DBBaseObject;

public class JsmQuestionStructure extends DBBaseObject {

	public static Question getRootQuestion(Question q) {
		Question rootQuestion = null;
		Question parentQuestion = q;
		try {
			while (!parentQuestion.getParentID().equals(Question.ROOTPARENTID)) {
				try {
					parentQuestion = new Question("", parentQuestion.getParentQuestionID());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			rootQuestion = parentQuestion;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rootQuestion;
	}

}
