package com.example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

	@Provides
	@Singleton
	Tester provideTester() {
		return new TesterImpl();
	}
}
