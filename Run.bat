set projectpath=%cd%
set classpath=%projectpath%\target\dependency-jars\*;%projectpath%\target\classes;
java -jar target\TestNGFramework.jar
#java -jar target\TestNGFramework.jar Yes 1 PROD Chrome TestDataProd.xlsx Local