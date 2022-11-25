import Converter.CelsiusConvereter;

interface Converter
{
    public double getConvertedValue(double baseTemperature);
}

    class CelsiusConverter implements Converter
    {
        @Override
        public double getConvertedValue(double baseTemperature)
        {
            return baseTemperature;
        }
    }

    class KelvinConverter implements Converter
    {
        @Override
        public double getConvertedValue(double baseTemperature)
        {
            return baseTemperature + 273.15;
        }
    }

    class FahrenheitConverter implements Converter
    {
        @Override
        public double getConvertedValue(double baseTemperature)
        {
            return 1.8 * baseTemperature + 32;
        }
    }


