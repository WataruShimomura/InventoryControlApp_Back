package com.lab.app.ketman.mybatis.domain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lab.app.ketman.mybatis.mapper.ReplyMapper;

@Controller

@MapperScan(basePackages = { "com.lab.app.ketman.mybatis.mapper.*"})
public class test {
	@Autowired
    ReplyMapper sm;


	@RequestMapping("/index")
	public String index(Model model) {
        Reply s = sm.selectByPrimaryKey(1);    // 検索結果をSongsオブジェクトに格納
        model.addAttribute("title", s.getName());  // getterで値を取り出す
        return "index";
    }
}
