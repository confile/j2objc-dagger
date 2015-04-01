package com.example;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = {ApplicationModule.class})
@Singleton
public interface ApplicationComponent {

	Tester getTester();
	
}
