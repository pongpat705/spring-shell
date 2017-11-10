package com.krungsri.batch.component;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Translate {

	@ShellMethod("concate String")
	public String concate(
			@ShellOption String v1,
			@ShellOption String v2){
				return v1+v2;
			}
}
