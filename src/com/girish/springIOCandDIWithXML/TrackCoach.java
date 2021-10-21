package com.girish.springIOCandDIWithXML;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
    private FortuneProvider provider;
    private String email;
    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneProvider(FortuneProvider provider) {
        this.provider = provider;
    }

    @Override
    public String getfortune() {
        System.out.println("my email is " + this.email);
        System.out.println("my team is " + this.team);
        return this.provider.getfortune();
    }

    @Override
    public void getDailyWorkout() {
        System.out.println("Play Cricket");
    }

    // this method will be invoked at the creation of bean
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: Inside the doMyStartupStuff");
    }

    // this method will be invoked at destroy point of bean
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: Inside the doMyCleanupStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroyed");
    }
}
