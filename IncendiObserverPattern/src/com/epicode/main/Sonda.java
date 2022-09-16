package com.epicode.main;

import java.util.ArrayList;
import java.util.List;

public class Sonda implements Subject {
	
	private Long id;
	private Double latitude;
	private Double longitude;
	private Integer incendioSmokeLevel;
	private boolean segnale  = false;
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyFire(URL url) {
		for(Observer o: observers) {
            o.update(url);
        }
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getIncendioSmokeLevel() {
		return incendioSmokeLevel;
	}

	public void setIncendioSmokeLevel(Integer incendioSmokeLevel) {
		this.incendioSmokeLevel = incendioSmokeLevel;
	}

	public boolean isSegnale() {
		return segnale;
	}

	public void setSegnale(boolean segnale) {
		this.segnale = segnale;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	

	public Sonda(Long id, Double latitude, Double longitude, Integer incendioSmokeLevel, boolean segnale) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.incendioSmokeLevel = incendioSmokeLevel;
		this.segnale = segnale;
		
	}
	
	
	

}
