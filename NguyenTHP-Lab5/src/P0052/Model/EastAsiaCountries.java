package P0052.Model;

public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries>{

    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String display() {
        return super.display() + countryTerrain;
    }

    @Override
    public int compareTo(EastAsiaCountries e) {
        return this.getCountryName().compareTo(e.getCountryName());
    }
}
