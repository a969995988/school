/**
 * 统计信息查询接口
 */
package com.jichuangsi.school.statistics.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jichuangsi.microservice.common.model.ResponseModel;
import com.jichuangsi.school.statistics.model.CourseStatisticsModel;
import com.jichuangsi.school.statistics.service.ICourseStatisticsService;

/**
 * @author huangjiajun
 *
 */
@RestController
public class StatisticsInfoQueryController {

	@Resource
	private ICourseStatisticsService courseStatisticsService;

	@GetMapping("/getCourseStatiResponseInfo/{courseId}")
	public ResponseModel<CourseStatisticsModel> getCourseStatiResponseInfo(@PathVariable String courseId) {
		CourseStatisticsModel model = courseStatisticsService.getCourseStatistics(courseId);
		return ResponseModel.sucess("", model);
	}

}
