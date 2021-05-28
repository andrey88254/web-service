package by.epam.web.entity;

import by.epam.web.entity.CalculableParameters;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CalculatorHash {
    private final HashMap<CalculableParameters, Integer> hashMap = new HashMap<>();

    public boolean isContain(CalculableParameters key) {
        return hashMap.containsKey(key);
    }

    public void addToMap(CalculableParameters key, Integer result) {
        hashMap.put(key, result);
        Result result1 = new Result(key,result);
        try {
            FileOutputStream fos = new FileOutputStream(new File("D:\\WebService\\WebService\\WebService\\src\\main\\resources\\templates\\base"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Запись объектов в файл
            oos.writeObject(result1);
            oos.close();
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Integer getParameters(CalculableParameters key) {
        return hashMap.get(key);
    }
}