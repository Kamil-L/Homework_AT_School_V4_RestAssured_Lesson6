API: http://openweathermap.org

GET: endpoint:  https://samples.openweathermap.org/data/2.5/weather


  1. Test GET, na dwóch warstwach, używając Request i Response specification, tak aby sam request był jak najmniejszy.

  2. Test jest sparametryzowany - @ParametrizedTest

  3. Jeden scenariusz dla pobrania pogody dla 3 lokalizacji: 

    • "London", ",uk", "2643743",
  
    • "Oxford", ",uk", "2640729", 
  
    • "Gdańsk", ",pl", "3099434",

OPCJONALNIE - uruchamianie tych testów paralelnie

OPCJONALNIE - dodać konfigurację w YAML
