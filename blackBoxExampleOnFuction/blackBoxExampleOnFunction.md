# Unit Testing Documentation template

**boolean acceptableToEat(int carb, int protein, int fat)**<br>
The function *acceptableToEat* receives the weight in grams of:<br> 
- carbohydrates
- proteins
- fats in a serving of food.<br> 
  It **returns true** if
  1) the total amount of calories is < 1000
  2) (carb + protein) / fat > 1⁄2 <br>
   
Example: <br> 
acceptableToEat (100,100,100) -> Error (tot amount of calories = 100*4 + 100*4 + 100*9 > 1000) <br>
acceptableToEat (1,1,10) -> Error (carb + protein / fat = 2/10)<br>
acceptableToEat (1,1,1) -> true (carb + protein / fat = 2/1)



# Black Box Unit Tests

## Method $acceptableToEat$

**Criteria for method $acceptableToEat$:**
	

- Sign of carbohydrate 

- Sign of proteins 

- Sign of fat 

- totalCalories

- (carb + fat)/2

  

**Predicates**

| Criterion            | Predicate |
| -------------------- | --------- |
| Sign of carbohydrate | >= 0      |
|                      | < 0       |
| Sign of proteins     | >= 0      |
|                      | < 0       |
| Sign of fat          | >= 0      |
|                      | < 0       |
| totalCalories        | <= 1000   |
|                      | > 1000    |
| (carb + fat)/2       | <= 0.5    |
|                      | > 0.5     |


**Boundaries**:

| Criterion            | Boundary values |
| -------------------- | --------------- |
| Sign of carbohydrate | -inf, 0, +inf   |
| Sign of proteins     | -inf, 0, +inf   |
| Sign of fat          | -inf, 0, +inf   |
| totalCalories        | 0, 1000, +inf   |
| (carb + fat)/2       | 0, 0.5 , +inf   |

<br>

**Combination of predicates**

| Sign of carbohydrate | Sign of proteins | Sign of fat | totalCalories | (carb + fat)/2 | Valid/Invalid | Description of the test case/JUnit test case |
| -------------------- | ---------------- | ----------- | ------------- | -------------- | ------------- | -------------------------------------------- |
| <0                   | *                | *           | *             | *              | Invalid       | Error                                        |
| *                    | < 0              | *           | *             | *              | Invalid       | Error                                        |
| *                    | *                | < 0         | *             | *              | Invalid       | Error                                        |
| [0, +inf)            | [0, +inf)        | [0, +inf)   | [0, 1000]     | [0, 0.5]       | Valid         | Error                                        |
| *                    | *                | *           | *             | (0.5, +inf)    | Valid         | True                                         |
| *                    | *                | *           | (1000, +inf)  | [0, 0.5]       | Valid         | Error                                        |



