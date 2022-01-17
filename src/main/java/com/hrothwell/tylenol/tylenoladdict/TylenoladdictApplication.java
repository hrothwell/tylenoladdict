package com.hrothwell.tylenol.tylenoladdict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//TODO setup a basic error page
//TODO DISABLE CACHE FOR USER ON THIS SITE
//TODO they can start a video, click to look at the next one, and it keeps playing the other video. Pause it somehow?
@SpringBootApplication
public class TylenoladdictApplication {

	public static void main(String[] args) {
		SpringApplication.run(TylenoladdictApplication.class, args);
	}
}
