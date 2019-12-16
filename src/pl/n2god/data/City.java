package pl.n2god.data;

/**
 * @author n2god on 16/12/2019
 * @project jdbcEeExercise
 */
public class City {
	private String name;
	private String population;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public City() {
	}

	public City(String name, String population) {
		this.name = name;
		this.population = population;
	}
}
