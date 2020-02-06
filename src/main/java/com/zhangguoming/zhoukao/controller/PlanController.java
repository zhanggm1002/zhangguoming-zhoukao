package com.zhangguoming.zhoukao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zhangguoming.zhoukao.service.PlanService;

@Controller
public class PlanController {
	@Autowired
	private PlanService planService;
}
