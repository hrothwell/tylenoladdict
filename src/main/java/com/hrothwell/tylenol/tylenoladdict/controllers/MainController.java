package com.hrothwell.tylenol.tylenoladdict.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Controller
public class MainController {

	private RestTemplate restTemplate = null;
	
	@RequestMapping("/")
	public String home(Model model) {
		Map<String, Object> data = getData();
		model.addAttribute("data", data);
		
		return "home.html";
	}
	
	private Map<String, Object> getData() {
		if(restTemplate == null) {
			restTemplate = new RestTemplate();
			//data stored in a github repo, grab raw
			restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("https://raw.githubusercontent.com/hrothwell/tylenoladdict-data/main/"));
		}
		
		String about = restTemplate.getForObject("/about.txt", String.class);
		String profilePic = restTemplate.getForObject("/picture.txt", String.class);
		String blink = restTemplate.getForObject("/blink.txt", String.class);
		String twitter = restTemplate.getForObject("/twitter.txt", String.class);
		String email = restTemplate.getForObject("/email.txt", String.class);
		String youtube = restTemplate.getForObject("/youtube.txt", String.class);
		String videoLinks = restTemplate.getForObject("/videoLinks.txt", String.class);
		String[] videoList = videoLinks.split("\n");//will this be the right thing to split by
		
		Map<String, Object> data = new HashMap<>();
		data.put("videoList", videoList);
		data.put("about", about);
		data.put("profilePic", profilePic);
		data.put("blink", blink);
		data.put("twitter", twitter);
		data.put("email", email);
		data.put("youtube", youtube);
		return data;
	}
}
