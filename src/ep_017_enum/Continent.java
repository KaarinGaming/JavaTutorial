package ep_017_enum;

public enum Continent {

	ANTARCTICA(14_200_000L, 1000L, "McMurdo"), AFRICA(30_370_000L, 1_393_676_444L, "Cairo"),
	ASIA(44_579_000L, 4_694_576_167L, "Shanghai"), AUSTRALIA(8_600_000L, 39_357_469L, "Sydney"),
	EUROPE(10_180_000L, 745_173_774L, "Muscow"), NORTH_AMERICA(24_709_000L, 592_296_233L, "New York"),
	SOUTH_AMERICA(17_840_000L, 434_254_119L, "São Paulo");

	private long sizeSqKm, population;
	private String biggestCity;

	Continent(long sizeSqKm, long population, String biggestCity) {
		this.sizeSqKm = sizeSqKm;
		this.population = population;
		this.biggestCity = biggestCity;
	}

	public long getSizeSqKm() {
		return sizeSqKm;
	}

	public long getPopulation() {
		return population;
	}

	public String getBiggestCity() {
		return biggestCity;
	}

}
