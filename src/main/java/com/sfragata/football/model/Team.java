/**
 * 
 */
package com.sfragata.football.model;

import java.io.Serializable;
import java.net.URL;

/**
 * Model class - Team
 * 
 * @author Silvio Fragata Silva
 * 
 */
public class Team implements Serializable {

	private static final long serialVersionUID = -8871956027655288171L;

	private Integer id;
	private String name;
	private URL countryFlagUrl;

	/**
	 * Default Constructor
	 */
	public Team() {
	}

	/**
	 * Constructor with all attributes
	 * 
	 * @param id
	 *            - Code
	 * @param name
	 *            - Country
	 * @param countryFlagUrl
	 *            - Country flag url
	 */
	public Team(Integer id, String name, URL countryFlagUrl) {
		super();
		this.id = id;
		this.name = name;
		this.countryFlagUrl = countryFlagUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URL getCountryFlagUrl() {
		return countryFlagUrl;
	}

	public void setCountryFlagUrl(URL countryFlagUrl) {
		this.countryFlagUrl = countryFlagUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Team [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", countryFlagUrl=");
		builder.append(countryFlagUrl);
		builder.append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryFlagUrl == null) ? 0 : countryFlagUrl.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (countryFlagUrl == null) {
			if (other.countryFlagUrl != null)
				return false;
		} else if (!countryFlagUrl.equals(other.countryFlagUrl))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
