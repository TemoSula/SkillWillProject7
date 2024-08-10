import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


    Set<Integer> set1 = new HashSet<>();
    set1.add(1);
    set1.add(33);
    set1.add(1432);
    set1.add(11241);

    Set<Integer> set2 = new HashSet<>();
    set2.add(1);
    set2.add(33);
    set2.add(1432);
    set2.add(11241);

        getSet(set1,set2);


        Map<Integer,List<Car>> carRelase = Map.of(
              2020, List.of(new Car("Mercedes"),new Car("Bmw")),
                2021, List.of(new Car("Audi"),new Car("Mercedes"),new Car("Bmw"))
        );

        getCars(carRelase);


    }


    public static void getSet(Set<Integer> a,Set<Integer> b)
    {
        Set<Integer> commonElements = new HashSet<>(a);

        commonElements.retainAll(b);

        for (Integer element: commonElements)
        {
            System.out.println("Same elements " + element);
        }

    }

    public static void getCars(Map<Integer, List<Car>> carRelase)
    {

        int bestYear = -1;
        int maxCars = 0;


        for (Integer year: carRelase.keySet())
        {
            List<Car> cars = carRelase.get(year);
            int numberOfCars = cars.size();

            if(numberOfCars > maxCars)
            {
                maxCars = numberOfCars;
                bestYear = year;
            }
        }

        System.out.println(bestYear);

        }


    }

