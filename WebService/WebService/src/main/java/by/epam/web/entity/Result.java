package by.epam.web.entity;

public class Result {
    CalculableParameters calculableParameters;
    Integer result;

    public CalculableParameters getCalculableParameters() {
        return calculableParameters;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void setCalculableParameters(CalculableParameters calculableParameters) {
        this.calculableParameters = calculableParameters;
    }
}
