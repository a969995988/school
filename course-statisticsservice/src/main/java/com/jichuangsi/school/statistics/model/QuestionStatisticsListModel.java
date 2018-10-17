/**
 * 同一个课堂的题目统计列表
 */
package com.jichuangsi.school.statistics.model;

import java.util.List;

/**
 * @author huangjiajun
 *
 */
public class QuestionStatisticsListModel {
	private String courseId;
	private List<QuestionStatisticsInfo> list;

	public final String getCourseId() {
		return courseId;
	}

	public final void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public final List<QuestionStatisticsInfo> getList() {
		return list;
	}

	public final void setList(List<QuestionStatisticsInfo> list) {
		this.list = list;
	}

}